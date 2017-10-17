package org.lee.spring.boot.demo.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value="/session")
public class SessionController {

    @GetMapping("/index")
    // @RequestMapping(value = "/index")
    public String index(HttpServletRequest request) {
        int maxInactiveInterval = request.getSession().getMaxInactiveInterval();
        String sessionId = WebUtils.getSessionId(request);
        // sessionId = request.getSession().getId();

        return String.format("session id is %s <br> timeout is %d", sessionId, maxInactiveInterval);
    }
}
