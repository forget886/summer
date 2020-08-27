package com.xinwu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: 张辉
 * @create: 2019-04-08
 **/
@RestController
public class HelloController {


    @RequestMapping(value = "/hello")
    public String index(HttpServletRequest request) {

        return "hello world";
    }



}


