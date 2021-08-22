package ru.geekbrains.routinglib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RoutingLibApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutingLibApplication.class, args);
    }

}
