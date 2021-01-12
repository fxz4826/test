package com.xpu.test.service.impl;

import com.xpu.test.bean.RecordInfo;
import com.xpu.test.dao.RecordDao;
import com.xpu.test.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    RecordDao recordDao;
    @Override
    public void addRecord(RecordInfo recordInfo) {
        System.out.println("service:addRecord------------");
        recordDao.addRecord(recordInfo);
    }
}
