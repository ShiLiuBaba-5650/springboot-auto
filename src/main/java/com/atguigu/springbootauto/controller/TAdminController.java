package com.atguigu.springbootauto.controller;

import com.atguigu.springbootauto.bean.TAdmin;
import com.atguigu.springbootauto.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin")
public class TAdminController {
    @Autowired
    TAdminService adminService;
    @RequestMapping("/getOne")
    public TAdmin getTAdminById(){
        return adminService.getTAdminById(1);
    }
}
