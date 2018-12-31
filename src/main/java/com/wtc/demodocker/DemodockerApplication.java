package com.wtc.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.wtc.controller")
@SpringBootApplication
public class DemodockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemodockerApplication.class, args);
    }

}

