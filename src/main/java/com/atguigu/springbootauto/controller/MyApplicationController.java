package com.atguigu.springbootauto.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApplicationController {
    @Value("${baby.name}")
    private String name;

    @Value("${baby.age}")
    private Integer age;

    //@RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello() {

        return "我们家的小石榴,name = " + name + "age = " + age;
    }
}
