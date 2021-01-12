package com.xpu.test.dao;

import com.xpu.test.bean.AdminInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface AdminDao {
    public boolean add(AdminInfo admin);     //注册


    @Select("SELECT * FROM tab_admin WHERE conAccount=#{conAccount} AND conPass=#{conPass}")
    public AdminInfo login(AdminInfo admin); //登录

    @Delete("delete from tab_admin where conAccount=#{conAccount}")
    public boolean delete(String conAccount);
    @Update("update  tab_admin set conName =#{conName},conPass=#{conPass} where conAccount=#{conAccount}")
    public boolean update(AdminInfo adminInfo);

 }

