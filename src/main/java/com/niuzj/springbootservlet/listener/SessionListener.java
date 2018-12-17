package com.niuzj.springbootservlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session init ...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session destroy ...");

    }
}
