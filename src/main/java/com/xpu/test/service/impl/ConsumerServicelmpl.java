package com.xpu.test.service.impl;

import com.xpu.test.bean.ConsumerInfo;
import com.xpu.test.bean.PolicyInfo;
import com.xpu.test.dao.ConsumerDao;
import com.xpu.test.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ConsumerServicelmpl implements ConsumerService {
    @Autowired
    ConsumerDao consumerDao;
    @Override
    public boolean regist(ConsumerInfo consumerInfo) {
        boolean result = consumerDao.add(consumerInfo);
        if(result){
            System.out.println("service:------------注册成功-----------");
            return result;
        }

        return result;
    }

    @Override
    public ConsumerInfo login(ConsumerInfo consumerInfo) {
        ConsumerInfo consumerInfo1 = consumerDao.login(consumerInfo);
        if(consumerInfo != null){
            System.out.println("登录成功");
            System.out.println("service:"+consumerInfo1.toString()+"---------------");
            return consumerInfo1;
        }else{
            System.out.println("登陆失败");
        }
        return null;
    }

    @Override
    public boolean delete(String conAccount) {
    boolean result = consumerDao.delete(conAccount);
        if(result){
            System.out.println("删除成功");
            return result;
        }else{
            System.out.println("删除失败");
        }
        return result;
    }

    @Override
    public ConsumerInfo selectInfo(String conId) {
        ConsumerInfo consumerInfo1 = consumerDao.selectInfo(conId);
        System.out.println("service:"+consumerInfo1.toString()+"---------------");
        if (consumerInfo1 != null){
            System.out.println("查询能成功");
            return consumerInfo1;
        }else{
            System.out.println("查询失败");
        }
        return null;
    }

    @Override
    public List<PolicyInfo> selectPolicy(String holderId) {
        List<PolicyInfo> list = consumerDao.selectPolicy(holderId);
        System.out.println("service"+list.toString()+"-----------");
        if(list!=null){
            System.out.println("service:-----查询成功");
            return list;
        }else{
            System.out.println("service:-----查询失败");
        }
        return null;
    }

    @Override
    public boolean updateConsumer(ConsumerInfo consumerInfo) {
       boolean result = consumerDao.updateConsumer(consumerInfo);
       if(result){
           System.out.println("更新成功");
           return result;

       }else{
           System.out.println("更新失败");
       }
       return  result;
    }
}
