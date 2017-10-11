package org.lee.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class IndexController {

    @RequestMapping(value = "/now")
    public Map<String, Object> now() {
        Map<String, Object> map = new HashMap<>();
        map.put("now", new Date());
        return map;
    }


}
