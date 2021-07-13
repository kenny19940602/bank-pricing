package com.jinlong.rpm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Swagger2API文档的配置
 */
@Configuration
public class Swagger3Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .securitySchemes(Collections.singletonList(HttpAuthenticationScheme.JWT_BEARER_BUILDER
////                        显示用
//                        .name("JWT")
//                        .build()))
//                .securityContexts(Collections.singletonList(SecurityContext.builder()
//                        .securityReferences(Collections.singletonList(SecurityReference.builder()
//                                .scopes(new AuthorizationScope[0])
//                                .reference("JWT")
//                                .build()))
//                        // 声明作用域
//                        .operationSelector(o -> o.requestMappingPattern().matches("/.*"))
//                        .build()))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jinlong.rpm.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("银行定价系统")
                .description("分布式银行定价系统")
                .contact(new Contact("kenny", "https://github.com/kenny19940602", "kenny19940602@163.com"))
                .version("1.0")
                .build();
    }
}
