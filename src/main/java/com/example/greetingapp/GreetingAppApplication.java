package com.example.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@SpringBootApplication
@ComponentScan("com.example.greetingapp.repositery")

public class GreetingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingAppApplication.class, args);
    }

}
