package com.atguigu.springbootauto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model){
        model.addAttribute("hello","hello,thymeleaf!!!");
        return "demo";
    }
}
