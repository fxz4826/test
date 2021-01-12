package com.xpu.test.dao;

import com.xpu.test.bean.PolicyInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PolicyDao {

    @Select("select * from tab_policy_information where policyNum=#{policyNum}")
    public PolicyInfo selectPolicy(String policyNum);

    @Delete("delete from tab_policy_information where policyNum=#{policyNum}")
    public boolean deletePy(String policyNum);

    @Insert("insert into tab_policy_information values(#{policyNum},#{holderName},#{holderSex},#{holderId},#{holderPhone},#{insuredName},#{insuredId},#{policyMoney},#{policyType},#{policyStartDate},#{policyYears},#{adminName})")
    public boolean addPy(PolicyInfo py);

    public boolean updatePy(PolicyInfo py);
}
