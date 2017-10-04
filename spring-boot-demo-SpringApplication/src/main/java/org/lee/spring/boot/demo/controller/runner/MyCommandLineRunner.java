package org.lee.spring.boot.demo.controller.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... string) throws Exception {
        System.out.println("### CommandLineRunner called just before SpringApplication.run() completes. ###");
    }
}
