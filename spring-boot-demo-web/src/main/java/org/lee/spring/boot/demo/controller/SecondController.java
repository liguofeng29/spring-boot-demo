package org.lee.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/path")
public class SecondController {

    @RequestMapping(value="/{value}", method= RequestMethod.GET)
    String getPathValue(@PathVariable String value) {
        return String.format("get %s from url.", value);
    }
}
