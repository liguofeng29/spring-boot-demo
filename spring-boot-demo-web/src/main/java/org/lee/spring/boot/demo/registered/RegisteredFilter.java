package org.lee.spring.boot.demo.registered;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class RegisteredFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(RegisteredFilter.class);
    private String encoding = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init()");
        encoding = "UTF-8";
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        System.out.println("doFilter()");
        response.setContentType("text/html; charset=" + encoding);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
        encoding = null;
    }

    @Bean
    public FilterRegistrationBean filter1() {
        logger.info("filter1 is classed.");
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new RegisteredFilter());
        bean.addUrlPatterns("/servlet1");
        bean.setOrder(2); // 数字が大きいほうが後に呼ばれる
        return bean;
    }

    @Bean
    public FilterRegistrationBean filter2() {
        logger.info("filter2 is classed.");
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new RegisteredFilter());
        bean.setOrder(1); // 数字が小さいほうが先に呼ばれる
        bean.addUrlPatterns("/*");
        return bean;
    }
}
