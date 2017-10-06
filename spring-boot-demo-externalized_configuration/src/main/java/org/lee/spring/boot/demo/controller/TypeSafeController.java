package org.lee.spring.boot.demo.controller;


import org.lee.spring.boot.demo.config.TypeSafeConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class TypeSafeController {

    @Autowired
    private TypeSafeConfiguration config;

    @RequestMapping(value = "typesafe")
    public TypeSafeConfiguration getJackson() {
        return config;
    }
}
