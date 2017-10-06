package org.lee.spring.boot.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class PriorityController {

    @Value(value = "${my.text}")
    private String text;

    @RequestMapping(value = "priority")
    public Map<String, Object> getRandom() {
        Map<String, Object> map = new HashMap<>();

        map.put("text", text);

        return map;
    }
}
