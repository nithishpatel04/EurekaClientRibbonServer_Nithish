package com.npv.week8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestRibbonServers2Application {
    public static void main(String[] args) {
        SpringApplication.run(RestRibbonServers2Application.class, args);
    }
}
