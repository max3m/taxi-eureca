package com.epam.training.microservices.taxieurecaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TaxiEurecaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxiEurecaApplication.class, args);
    }

}
