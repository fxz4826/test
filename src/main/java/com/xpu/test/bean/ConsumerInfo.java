package com.xpu.test.bean;

public class ConsumerInfo {
    private String conAccount;
    private String conName;
    private String conPass;
    private String conSex;
    private String conId;
    private String conPhone;
    private String conAddress;

    public String getConSex() {
        return conSex;
    }

    public void setConSex(String conSex) {
        this.conSex = conSex;
    }

    public String getConId() {
        return conId;
    }

    public void setConId(String conId) {
        this.conId = conId;
    }

    public String getConPhone() {
        return conPhone;
    }

    public void setConPhone(String conPhone) {
        this.conPhone = conPhone;
    }

    public String getConAddress() {
        return conAddress;
    }

    public void setConAddress(String conAddress) {
        this.conAddress = conAddress;
    }

    public String getConAccount() {
        return conAccount;
    }

    public void setConAccount(String conAccount) {
        this.conAccount = conAccount;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConPass() {
        return conPass;
    }

    public void setConPass(String conPass) {
        this.conPass = conPass;
    }

    public ConsumerInfo() {
    }

    public ConsumerInfo(String conAccount, String conName, String conPass, String conSex, String conId, String conPhone, String conAddress) {
        this.conAccount = conAccount;
        this.conName = conName;
        this.conPass = conPass;
        this.conSex = conSex;
        this.conId = conId;
        this.conPhone = conPhone;
        this.conAddress = conAddress;
    }

    @Override
    public String toString() {
        return "ConsumerInfo{" +
                "conAccount='" + conAccount + '\'' +
                ", conName='" + conName + '\'' +
                ", conPass='" + conPass + '\'' +
                ", conSex='" + conSex + '\'' +
                ", conId='" + conId + '\'' +
                ", conPhone='" + conPhone + '\'' +
                ", conAddress='" + conAddress + '\'' +
                '}';
    }
}
