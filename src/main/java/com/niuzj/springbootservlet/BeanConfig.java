package com.niuzj.springbootservlet;

import com.niuzj.springbootservlet.filter.ContextFilter;
import com.niuzj.springbootservlet.listener.SessionListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Collections;

@Configuration
public class BeanConfig {

    //使用FilterRegistrationBean配置过滤器,启动类不需使用@ServletComponentScan
    @Bean
    public FilterRegistrationBean contextFilter(){
        FilterRegistrationBean<ContextFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new ContextFilter());
        filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

    //ServletListenerRegistrationBean创建listener
    @Bean
    public ServletListenerRegistrationBean<SessionListener> sessionListener(){
        ServletListenerRegistrationBean<SessionListener> registrationBean = new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new SessionListener());
        return registrationBean;
    }


}
