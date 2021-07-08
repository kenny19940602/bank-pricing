package com.jinlong.common.params;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jinlong")
@MapperScan("com.jinlong.bank.pricing.mbg")
public class CommonParamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonParamsApplication.class, args);
    }

}
