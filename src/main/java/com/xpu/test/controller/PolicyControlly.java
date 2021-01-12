package com.xpu.test.controller;
import com.xpu.test.bean.PolicyInfo;
import com.xpu.test.service.PolicyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

@RestController
@RequestMapping("/policy")
@CrossOrigin
public class PolicyControlly {

    @Autowired
    PolicyInfoService policyInfoService;

    @PostMapping("/select")
    public PolicyInfo selectPolicInfo(String policyNum){        //查询保单
        //String holderId="123";
        System.out.println("------------"+policyNum+"-------------");

        PolicyInfo pyInfo = policyInfoService.selectPolicy(policyNum);
        if(pyInfo != null){
            System.out.println("查询成功");
            System.out.println(pyInfo);
        }else{
            System.out.println("查询失败");
        }
        return pyInfo;
    }
    @PostMapping("/delete")
    public boolean delete(String policyNum){          //删除保单
        System.out.println(policyNum);
        PolicyInfo policyInfo=new PolicyInfo();
        policyInfo.setPolicyNum(policyNum);
        boolean result = policyInfoService.deletePy(policyInfo.getPolicyNum());
        if(result){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return  result;
    }

    @PostMapping("/add")
    public boolean add(@RequestBody PolicyInfo policyInfo){             //添加保单
        //PolicyInfo py = new PolicyInfo("333","xs","sxs","xss","sxs","xss","sxs","sxs","sx","20201002","sxs","xcedc");
        Random random = new Random();
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        String Y = Integer.toString(year);
        int month = calendar.get(calendar.MONTH) + 1;
        String M;
        if(month<10) {
            M = "0"+ month;
        }else{
            M = Integer.toString(month);
        }
        int day = calendar.get(calendar.DATE);
        String D;
        if(day<10) {
            D = "0"+ day;
        }else{
            D = Integer.toString(day);
        }

        String date = Y+M+D;
        int num = random.nextInt(900000)+100000;

        policyInfo.setPolicyNum(date+Integer.toString(num));     //设置自动生成保单号


        policyInfo.setPolicyStartDate(date);     //设置保单日期

        System.out.println("controller:---------------"+policyInfo);
        boolean result = policyInfoService.addPy(policyInfo);
        if(result){
            System.out.println("controller:------增添成功-------");
        }else{
            System.out.println("controller:------增添失败--------");
        }
        return result;
    }
    @PostMapping("/update")
    public boolean update(@RequestBody PolicyInfo policyInfo){
        boolean result=false;
//        PolicyInfo py = new PolicyInfo();
//        py.setPolicyNum("333");
        result = policyInfoService.updatePy(policyInfo);
        if(result){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        return  result;
    }
}
