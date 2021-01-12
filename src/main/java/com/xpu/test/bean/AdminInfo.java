package com.xpu.test.bean;

public class AdminInfo {
    private String conAccount;
    private String conName;
    private String conPass;

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

    public AdminInfo() {
    }

    public AdminInfo(String conAccount, String conName, String conPass) {
        this.conAccount = conAccount;
        this.conName = conName;
        this.conPass = conPass;
    }

    @Override
    public String toString() {
        return "consumerInfo{" +
                "conAccount='" + conAccount + '\'' +
                ", conName='" + conName + '\'' +
                ", conPass='" + conPass + '\'' +
                '}';
    }
}
