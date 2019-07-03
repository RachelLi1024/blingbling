package com.blingbling.service;

import com.blingbling.dao.BbDao;
import com.blingbling.pojo.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private BbDao bbDao;

    @Override
    public List<Admin> findAll() {
        return bbDao.findAll();
    }
}
