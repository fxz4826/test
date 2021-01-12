package com.xpu.test.bean;

import java.util.ArrayList;
import java.util.List;

public class PolicyInfo  {
    private String policyNum;          //保单号
    private String holderName;
    private String holderSex;
    private String holderId;
    private String holderPhone;
    private String insuredName;
    private String insuredId;
    private String policyMoney;
    private String policyType;
    private String policyStartDate;
    private String policyYears;
    private String adminName;

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderSex() {
        return holderSex;
    }

    public void setHolderSex(String holderSex) {
        this.holderSex = holderSex;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getHolderPhone() {
        return holderPhone;
    }

    public void setHolderPhone(String holderPhone) {
        this.holderPhone = holderPhone;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId;
    }

    public String getPolicyMoney() {
        return policyMoney;
    }

    public void setPolicyMoney(String policyMoney) {
        this.policyMoney = policyMoney;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(String policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public String getPolicyYears() {
        return policyYears;
    }

    public void setPolicyYears(String policyYears) {
        this.policyYears = policyYears;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }



    @Override
    public String toString() {
        return "PolicyInfo{" +
                "policyNum='" + policyNum + '\'' +
                ", holderName='" + holderName + '\'' +
                ", holderSex='" + holderSex + '\'' +
                ", holderId='" + holderId + '\'' +
                ", holderPhone='" + holderPhone + '\'' +
                ", insuredName='" + insuredName + '\'' +
                ", insuredId='" + insuredId + '\'' +
                ", policyMoney='" + policyMoney + '\'' +
                ", policyType='" + policyType + '\'' +
                ", policyStartDate='" + policyStartDate + '\'' +
                ", policyYears='" + policyYears + '\'' +
                ", adminName='" + adminName + '\'' +
                '}';
    }
}
