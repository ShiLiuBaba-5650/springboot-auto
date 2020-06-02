package com.atguigu.springbootauto.dao;

import com.atguigu.springbootauto.bean.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TUserDao {
    List<TUser> getList();
}
