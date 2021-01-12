package com.xpu.test.service.impl;


import com.xpu.test.bean.AdminInfo;
import com.xpu.test.dao.AdminDao;
import com.xpu.test.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired        //-------------
    private AdminDao adminDao;

    @Override
    public boolean adminRegist(AdminInfo admin) {
        boolean flag = adminDao.add(admin);
        if(flag){
            System.out.println("service:------------注册成功-----------");
            return flag;
        }

        return flag;
    }

    @Override
    public AdminInfo adminLogin(AdminInfo admin) {
        AdminInfo loginedAdmin = adminDao.login(admin);
        if(loginedAdmin!=null){
            System.out.println("service:------------登录成功-----------");
            return loginedAdmin;
        }
        return null;
    }

    @Override
    public boolean delete(String conAccount) {
        boolean result = adminDao.delete(conAccount);
        if(result){
            System.out.println("删除成功");
            return true;
        }else{
            System.out.println("删除失败哦");
        }
       return result;
    }

    @Override
    public boolean update(AdminInfo adminInfo) {
        boolean result = adminDao.update(adminInfo);
        if(result){
            System.out.println("删除成功");
            return true;
        }else{
            System.out.println("删除失败哦");
        }
        return false;
    }
}
