package org.lee.spring.boot.demo.controller;

import org.lee.spring.boot.demo.model.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class FirstController {

    @Autowired
    private Apple apple;

    @RequestMapping("/")
    String index() {
        return "this is top page.";
    }

    @RequestMapping("/now")
    String now() {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf1.format(new Date());
    }

    @RequestMapping("/apple")
    Apple getApple() {
        // return json
        return apple;
    }
}
