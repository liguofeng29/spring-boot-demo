package org.lee.spring.boot.demo.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Custom error handler use ErrorController
 */
@Controller
@RequestMapping(value = "error")
public class CustomErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "error/custom-error";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }

    @RequestMapping(value = "runtime-exception")
    public String getRuntimeException() {
        throw new RuntimeException("Runtime exception YO!");
    }
}


