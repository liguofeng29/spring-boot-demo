package org.lee.spring.boot.demo.handler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorHandler {

    private Logger logger = LoggerFactory.getLogger(ErrorHandler.class);


    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processRuntimeException(RuntimeException ex) {
        logger.info("カスタムエラーハンドリング" + ex.getMessage());

        ModelAndView m = new ModelAndView();
        m.addObject("ex", ex.getMessage());
        m.setViewName("error/runtime-exception");

        return m;
    }
}
