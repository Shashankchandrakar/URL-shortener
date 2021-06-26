package com.system.design.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = "com.system.design")
@EntityScan(basePackages = "com.system.design")
@EnableMongoRepositories(basePackages = "com.system.design")
public class URLShortenerApplication extends SpringApplication {
    public static void main(String[] args) {
        run(URLShortenerApplication.class, args);
    }
}
