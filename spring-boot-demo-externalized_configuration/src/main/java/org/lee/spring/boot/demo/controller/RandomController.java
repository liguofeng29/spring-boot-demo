package org.lee.spring.boot.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class RandomController {

    @Value(value = "${my.random.secret}")
    private String secret;

    @Value(value = "${my.random.number}")
    private Integer number;

    @Value(value = "${my.random.bigNumber}")
    private Long bigNumber;

    @Value(value = "${my.random.uuid}")
    private String uuid;

    @Value(value = "${my.random.number.less.than.ten}")
    private Integer numberLessThanTen;

    @Value(value = "${my.random.number.in.range}")
    private Integer rangeInt;

    @RequestMapping(value = "random")
    public Map<String, Object> getRandom() {
        Map<String, Object> map = new HashMap<>();
        map.put("random.secret", secret);
        map.put("random.number", number);
        map.put("random.bigNumber", bigNumber);
        map.put("random.uuid", uuid);
        map.put("random.number.less.than.ten", numberLessThanTen);
        map.put("random.range.int", rangeInt);

        return map;
    }
}
