package com.xpu.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import
        org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class test {
    //    @RequestMapping(value = "/springboot")
    @GetMapping("/sp")
    public String startSpringBoot() {
        System.out.println("-----------------");
        return "Welcome to the world of Spring Boot!";
    }
}
