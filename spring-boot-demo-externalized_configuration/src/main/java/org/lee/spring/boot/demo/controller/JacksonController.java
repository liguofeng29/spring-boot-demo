package org.lee.spring.boot.demo.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class JacksonController {

    @RequestMapping(value = "jackson")
    public Map<String, Object> getJackson() {
        Map<String, Object> map = new HashMap<>();
        map.put("date", new Date());
        return map;
    }
}
