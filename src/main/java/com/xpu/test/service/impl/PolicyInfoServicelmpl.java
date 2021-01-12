package com.xpu.test.service.impl;

import com.xpu.test.bean.PolicyInfo;
import com.xpu.test.dao.PolicyDao;
import com.xpu.test.service.PolicyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyInfoServicelmpl implements PolicyInfoService {
  @Autowired
  PolicyDao policyDao;
    @Override
    public PolicyInfo selectPolicy(String policyNum) {
        PolicyInfo policyInfo = policyDao.selectPolicy(policyNum);
        if(policyInfo != null){
            System.out.println("sxs");
            return policyInfo;
        }
        return null;
    }
    @Override
    public boolean deletePy(String policyNum) {            //删除保单
        boolean result = policyDao.deletePy(policyNum);
        if(result){
            System.out.println("service:---------删除成功----------");
            return true;
        }else{
            System.out.println("service:---------删除失败-----------");
        }
        return false;
    }
    @Override
    public boolean addPy(PolicyInfo py) {
        System.out.println("service:---------------"+py);
        boolean result = policyDao.addPy(py);
        if(result){
            System.out.println("service:---------添加成功----------");
            return true;
        }else{
            System.out.println("service:---------添加失败-----------");
        }
        return false;
    }
    @Override
    public boolean updatePy(PolicyInfo py) {
        boolean result = policyDao.updatePy(py);
        if(result){
            System.out.println("修改成功");
            return true;
        }else{
            System.out.println("删除失败哦");
        }
        return false;
    }
}
