package com.atguigu.springbootauto.controller;

import com.atguigu.springbootauto.bean.TUser;
import com.atguigu.springbootauto.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tuser")
public class TUserController {
    @Autowired
    TUserService userService;

    @RequestMapping("/getAllTUser")
    public List<TUser> getAllTUser(){
        return userService.getList();
    }
}
