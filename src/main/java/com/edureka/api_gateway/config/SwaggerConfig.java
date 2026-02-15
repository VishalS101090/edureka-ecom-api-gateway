//package com.edureka.api_gateway.config;
//
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public GroupedOpenApi customerServiceApi() {
//        return GroupedOpenApi.builder()
//                .group("customer-service")
//                .pathsToMatch("/customer-service/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi productServiceApi() {
//        return GroupedOpenApi.builder()
//                .group("product-service")
//                .pathsToMatch("/product-service/**")
//                .build();
//    }
//}
