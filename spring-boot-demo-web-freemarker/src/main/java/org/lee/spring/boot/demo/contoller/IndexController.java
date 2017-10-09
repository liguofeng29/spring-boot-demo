package org.lee.spring.boot.demo.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/freemarker")
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        logger.debug("index.ftl");

        map.put("name", "Alex");
        return "index";
    }
}
