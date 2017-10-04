package org.lee.spring.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {

    @Autowired
    private ApplicationArguments arguments;

    @RequestMapping("/")
    List<String> index() {
        return arguments.getNonOptionArgs();
    }
}
