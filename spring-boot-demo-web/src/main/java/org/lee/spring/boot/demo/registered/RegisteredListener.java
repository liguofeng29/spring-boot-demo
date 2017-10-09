package org.lee.spring.boot.demo.registered;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


@Component
public class RegisteredListener implements ServletContextListener {
    private Logger logger = LoggerFactory.getLogger(RegisteredFilter.class);

    @Override
    public void contextInitialized(ServletContextEvent event){
        logger.info("########## Webアプリ起動 ##########");
        logger.info("RegisteredListener#contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("########## Webアプリ終了 ##########");
        logger.info("RegisteredListener#contextDestroyed");
    }

    @Bean
    public ServletListenerRegistrationBean<RegisteredListener> jsfConfigureListener() {
        return new ServletListenerRegistrationBean<>(new RegisteredListener());
    }
}
