package com.xpu.test.dao;


import com.xpu.test.bean.ConsumerInfo;
import com.xpu.test.bean.PolicyInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ConsumerDao {
    @Insert("insert into tab_consumer values (#{conAccount},#{conName},#{conPass},#{conSex},#{conId},#{conPhone},#{conAddress})")
    public boolean add(ConsumerInfo consumerInfo);//注册

    @Select("SELECT * FROM tab_consumer WHERE conPass=#{conPass} AND conPhone=#{conPhone}")
    public ConsumerInfo login(ConsumerInfo consumerInfo);

    @Delete("delete from tab_consumer where conAccount=#{conAccount}")
    public boolean delete(String conAccount);

    @Select("SELECT * FROM tab_consumer WHERE conId=#{conId}")
    public ConsumerInfo selectInfo(String conId);

    @Select("SELECT * FROM tab_policy_information where holderId=#{holderId}")
    public List<PolicyInfo> selectPolicy(String holderId);

    @Update("update  tab_consumer set conName=#{conName},conPass=#{conPass},conSex=#{conSex},conId=#{conId},conPhone=#{conPhone},conAddress=#{conAddress} where conId=#{conId}")
    public boolean updateConsumer(ConsumerInfo consumerInfo);
}
