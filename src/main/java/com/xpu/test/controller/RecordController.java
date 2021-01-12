package com.xpu.test.controller;

import com.xpu.test.bean.RecordInfo;
import com.xpu.test.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/record")
@CrossOrigin
public class RecordController {
    @Autowired
    RecordService recordService;

    @PostMapping("/addRecord")
    public void addRecord(RecordInfo recordInfo){
        System.out.println("controller:addRecord---------------");
        recordService.addRecord(recordInfo);
    }

}
