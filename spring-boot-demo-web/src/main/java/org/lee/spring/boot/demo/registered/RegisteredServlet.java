package org.lee.spring.boot.demo.registered;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

@Component
public class RegisteredServlet extends HttpServlet {

    // register servlet with ServletRegistrationBean
    @Bean
    ServletRegistrationBean statsServlet() {
        // return new ServletRegistrationBean(new RegisteredServlet(), "/sampleServlet");
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new RegisteredServlet());
        bean.setUrlMappings(Collections.singletonList("/servlet1"));
        return bean;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("ServletRegistrationBeanで登録されたServletです。");
        writer.flush();
    }
}
