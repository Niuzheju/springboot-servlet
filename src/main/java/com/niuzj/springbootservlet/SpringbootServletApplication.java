package com.niuzj.springbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//扫描Servlet注解, @WebListener, @WebFilter
@ServletComponentScan
public class SpringbootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServletApplication.class, args);
    }
}
