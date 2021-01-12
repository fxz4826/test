package com.xpu.test.controller;

import com.xpu.test.bean.AdminInfo;
import com.xpu.test.bean.RecordInfo;
import com.xpu.test.service.AdminService;
import com.xpu.test.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;
    @Autowired
    RecordService recordService;

    @PostMapping("/regist")
    public boolean regist(@RequestBody AdminInfo adminInfo){
        //AdminInfo admin = new AdminInfo("aaa","aaa","aaa");
        boolean flag = adminService.adminRegist(adminInfo);
        if(flag){
            System.out.println("controller:--------注册成功-------------");
            return flag;
        }else{
            System.out.println("controller:--------注册失败-------------");
        }

        return false;
    }

    @PostMapping("/login")
    public AdminInfo login(@RequestBody AdminInfo getAdmin){
        //AdminInfo admin = new AdminInfo("bbb","bbb","bbb");
        //AdminInfo admin = getAdmin;

//        System.out.println("session:"+session.toString());
////        Object s = session.getAttribute("user");
////        System.out.println(s.toString());

        System.out.println("-----------542582--------");
        AdminInfo loginedAdmin = adminService.adminLogin(getAdmin);
        if(loginedAdmin!=null){
            //session.setAttribute("logUser",loginedAdmin);
            System.out.println("controller:--------登录成功-------------");
            RecordInfo recordInfo = new RecordInfo();
            recordInfo.setLoginedAccount(loginedAdmin.getConAccount());
            recordInfo.setLoginedName(loginedAdmin.getConName());
            Date date = new Date();
            recordInfo.setLoginedTime(date.toString());
            recordService.addRecord(recordInfo);
        }else{
            System.out.println("controller:--------登录失败-------------");
        }

        return loginedAdmin;
    }


    @GetMapping("/delete")
    public boolean delete(){
        boolean result = adminService.delete("aaa");
        if(result){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return  false;
    }

    @GetMapping("/update")
    public AdminInfo update(){
        AdminInfo admin = new AdminInfo("aaa","dd","dd");
        boolean result = adminService.update(admin);
        if(result){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return  admin;
    }

}
