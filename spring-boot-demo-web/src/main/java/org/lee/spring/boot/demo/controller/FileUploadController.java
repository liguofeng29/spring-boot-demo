package org.lee.spring.boot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequestMapping(value = "/file")
public class FileUploadController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/index")
    public String index() {
        return "upload";
    }

    @RequestMapping(value = "upload")
    @ResponseBody
    public String upload(@RequestParam("anyFile") MultipartFile file) {

        if (file.isEmpty()) {
            return "file size is 0";
        }

        // 保存処理は省略

        logger.info("upload file name is " + file.getOriginalFilename());

        return "upload success";
    }
}
