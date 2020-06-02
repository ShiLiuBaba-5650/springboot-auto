package com.atguigu.springbootauto.service;

import com.atguigu.springbootauto.bean.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TUserServiceTest {
    @Autowired
    TUserService userService;
    @Test
    public void testTUserService(){
        List<TUser> list = userService.getList();
        for (TUser tUser : list) {
            System.out.println(tUser);
        }
    }
}
