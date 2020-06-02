package com.atguigu.springbootauto.service.impl;

import com.atguigu.springbootauto.bean.TAdmin;
import com.atguigu.springbootauto.dao.TadminDao;
import com.atguigu.springbootauto.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TAdminServiceImpl implements TAdminService {
    @Autowired
    TadminDao adminDao;
    @Override
    public TAdmin getTAdminById(Integer id) {
        return adminDao.getOne(id);
    }
}
