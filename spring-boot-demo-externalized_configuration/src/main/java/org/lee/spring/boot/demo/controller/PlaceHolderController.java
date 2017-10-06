package org.lee.spring.boot.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class PlaceHolderController {

    @Value(value = "${my.name}")
    private String name;

    @Value(value = "${my.name.place-holder}")
    private String placeHolder;

    @RequestMapping(value = "placeholder")
    public Map<String, Object> getRandom() {
        Map<String, Object> map = new HashMap<>();

        map.put("name", name);
        map.put("placeHolder", placeHolder);

        return map;
    }
}
