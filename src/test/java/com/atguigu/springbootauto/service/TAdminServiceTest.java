package com.atguigu.springbootauto.service;

import com.atguigu.springbootauto.bean.TAdmin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TAdminServiceTest {
    @Autowired
    TAdminService adminService;
    @Test
    public void testAdminService(){
        TAdmin admin = adminService.getTAdminById(1);
        System.out.println(admin);
    }
}
