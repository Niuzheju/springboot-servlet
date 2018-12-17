package com.niuzj.springbootservlet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexController {

    @RequestMapping("/time")
    public String time(HttpSession session){
        return String.valueOf(System.currentTimeMillis());
    }

}
