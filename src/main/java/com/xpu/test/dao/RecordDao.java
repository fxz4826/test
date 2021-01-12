package com.xpu.test.dao;

import com.xpu.test.bean.RecordInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordDao {
    @Insert("insert into tab_login_record values(#{loginedAccount},#{loginedName},#{loginedTime})")
    public void addRecord(RecordInfo recordInfo);
}
