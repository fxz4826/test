package com.xpu.test.controller;

import com.xpu.test.bean.ConsumerInfo;
import com.xpu.test.bean.PolicyInfo;
import com.xpu.test.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

@RestController   //返回json格式数据
@RequestMapping("/consumer")
@CrossOrigin
public class ConsumerController {

 @Autowired
    ConsumerService consumerService;
 @PostMapping("/regist")
    public boolean regist(@RequestBody ConsumerInfo consumerInfo) {
     //ConsumerInfo consumerInfo = new ConsumerInfo("sss","sss","sss","男","610327199703024","18791989303","西安工程大学") ;

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

     consumerInfo.setConAccount(date+Integer.toString(num));     //设置自动生成保单号


     boolean result = consumerService.regist(consumerInfo);
    if(result){
        System.out.println("注册成功");
  }else{
        System.out.println("注册失败");
    }
    return  result;
 }
@PostMapping("/login")
    public ConsumerInfo login(@RequestBody ConsumerInfo consumerInfo){
     //ConsumerInfo consumerInfo = new ConsumerInfo("sss","sss","sss","男","610327199703024","18791989303","西安工程大学");
     ConsumerInfo consumerInfo2 = consumerService.login(consumerInfo);
     if(consumerInfo2 != null){
         System.out.println("登陆成功");
         System.out.println("-------------"+consumerInfo2+"-----------");
         return consumerInfo2;

     }else{
         System.out.println("登陆失败");
     }
     return null;
}
@PostMapping("/delete")
    public boolean delete(String conAccount){
     boolean result = consumerService.delete(conAccount);
     if(result){
         System.out.println("删除成功");
         return result;
     }else{
         System.out.println("删除失败");
     }
     return result;
 }
@PostMapping("/selectInfo")
    public ConsumerInfo selectInfo(String conId){
     ConsumerInfo consumerInfo1 = consumerService.selectInfo(conId);
     if(consumerInfo1 != null){
         System.out.println("查询成功");
         return consumerInfo1;
     }else{
         System.out.println("查寻失败");
     }
    return  null;
}
@PostMapping("/selectPolicy")
    public List<PolicyInfo> selectPolicy( String holderId){

    System.out.println(holderId+"-----------selectPolicy------------");
    //ConsumerInfo consumerInfo = new ConsumerInfo("sss","sss","sss","男","610327199703024","18791989303","西安工程大学");
    List<PolicyInfo> list = consumerService.selectPolicy(holderId);
    System.out.println("controll"+list);
    if(list!=null){
        System.out.println("controller:-------------查询成功");
        return list;
    }else{
        System.out.println("controller:-------------查询失败");
    }
    return null;
}
@PostMapping("/update")
    public boolean updateConsumer(@RequestBody ConsumerInfo consumerInfo){
    System.out.println(consumerInfo);
     boolean result = consumerService.updateConsumer(consumerInfo);
     if(result){
         System.out.println("更新成功");
         return result;
     }else{
         System.out.println("更新失败");
     }
     return result;
}
}
