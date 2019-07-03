package com.blingbling.service;

import java.util.List;

import com.blingbling.pojo.Admin;

public interface AdminService {
    /**
     * 查询所有
     * @return
     */
    List<Admin> findAll();
}
