package com.jinlong.rpm;

import com.jinlong.dubble.api.common.params.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class RpmApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(RpmApplication.class, args);
    }


    @Bean
    public ApplicationRunner runner() {
        return args -> logger.info(demoService.sayHello("mercyblitz"));
    }
}
