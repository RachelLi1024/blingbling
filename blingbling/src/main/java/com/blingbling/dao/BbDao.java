package com.blingbling.dao;

import java.util.List;
import org.apache.ibatis.annotations.*;

import com.blingbling.pojo.*;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "BbDao")
public interface BbDao {
    /**
     * 查询管理员数据
     */
    @Select("SELECT a_id,a_number,a_pwd,a_name FROM administrator")
    List<Admin> findAll();
}
