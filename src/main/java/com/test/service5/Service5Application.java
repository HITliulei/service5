package com.test.service5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service5Application {

    public static void main(String[] args) {
        SpringApplication.run(Service5Application.class, args);
    }

}
