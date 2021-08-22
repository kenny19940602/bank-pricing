package com.jinlong.common.params;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.listener.Listener;
import com.jinlong.common.params.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;
import java.util.concurrent.Executor;

@SpringBootApplication
@EnableDiscoveryClient
public class CommonParamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonParamsApplication.class, args);
    }

    @Bean
    public UserConfig userConfig() {
        return new UserConfig();
    }
}
@Component
class SampleRunner implements ApplicationRunner {

    @Autowired
    private NacosConfigManager nacosConfigManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        nacosConfigManager.getConfigService().addListener(
                "nacos-config-custom.yaml", "DEFAULT_GROUP", new Listener() {

                    /**
                     * Callback with latest config data.
                     * @param configInfo latest config data for specific dataId in Nacos
                     * server
                     */
                    @Override
                    public void receiveConfigInfo(String configInfo) {
                        Properties properties = new Properties();
                        try {
                            properties.load(new StringReader(configInfo));
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("config changed: " + properties);
                    }

                    @Override
                    public Executor getExecutor() {
                        return null;
                    }
                });
    }

}
