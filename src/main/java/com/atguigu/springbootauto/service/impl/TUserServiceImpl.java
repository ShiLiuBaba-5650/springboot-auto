package com.atguigu.springbootauto.service.impl;

import com.atguigu.springbootauto.bean.TUser;
import com.atguigu.springbootauto.dao.TUserDao;
import com.atguigu.springbootauto.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TUserServiceImpl implements TUserService {
    //@Autowired
    @Resource
    TUserDao userDao;
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public List<TUser> getList() {
        String key = "allTUser";
        List<TUser> list = (List<TUser>) redisTemplate.boundValueOps(key).get();
        if (list != null) {
            return list;
        }
        list = userDao.getList();
        if (list != null && list.size() > 0) {
            redisTemplate.boundValueOps(key).set(list);
        }
        return list;
    }
}
