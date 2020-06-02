package com.atguigu.springbootauto.dao;

import com.atguigu.springbootauto.bean.TAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TadminDao extends JpaRepository<TAdmin,Integer> {
}
