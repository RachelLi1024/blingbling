package com.blingbling.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.blingbling.pojo.Admin;
import com.blingbling.service.AdminService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<Admin> findAllAdmin() {
        System.out.println("开始查询所有数据...");
        return adminService.findAll();
    }

}
