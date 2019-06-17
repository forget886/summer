package com.xinwu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author: 张辉
 * @create: 2019-04-08
 **/
@RestController
public class HelloController {


    @RequestMapping(value = "/hello")
    public String index(HttpServletRequest request) {
        System.out.println(request.getHeader("Referer"));
        System.out.println(request.getHeader("Origin"));
        System.out.println(request.getHeader("User-Agent"));
        Enumeration<String> names = request.getHeaderNames();
        if(names.hasMoreElements()){
            String name = names.nextElement();
            System.out.println(name + " : " + request.getHeader(name));
        }
        return "hello world";
    }

}


