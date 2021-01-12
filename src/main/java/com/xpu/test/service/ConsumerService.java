package com.xpu.test.service;

import com.xpu.test.bean.ConsumerInfo;
import com.xpu.test.bean.PolicyInfo;

import java.util.List;

public interface ConsumerService {
    public boolean regist(ConsumerInfo consumerInfo);
    public ConsumerInfo login(ConsumerInfo consumerInfo);
    public boolean delete(String conAccount);
    public ConsumerInfo selectInfo(String conId);
    public List<PolicyInfo> selectPolicy(String  holderId);
    public boolean updateConsumer(ConsumerInfo consumerInfo);
}
