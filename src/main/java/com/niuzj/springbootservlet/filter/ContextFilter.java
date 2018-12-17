package com.niuzj.springbootservlet.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

//注解方式,需在启动类上使用@ServletComponentScan
//@WebFilter(urlPatterns = "/*")
public class ContextFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("===ContextFilter===");
        HttpServletRequest request = null;
        if (servletRequest instanceof HttpServletRequest) {
            request = (HttpServletRequest) servletRequest;
        }
        if (request == null) {
            return;
        }
        System.out.println(request.getRequestURI());
        Map<String, String[]> parameterMap = request.getParameterMap();
        StringBuilder sb = new StringBuilder("param-->");
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()[0]).append("  ");
        }
        System.out.println(sb.toString());

        filterChain.doFilter(servletRequest, servletResponse);

    }
}
