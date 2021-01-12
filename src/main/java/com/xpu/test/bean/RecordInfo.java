package com.xpu.test.bean;

public class RecordInfo {
    private String loginedAccount;
    private String loginedName;
    private String loginedTime;

    public RecordInfo() {
    }

    public RecordInfo(String loginedAccount, String loginedName, String loginedTime) {
        this.loginedAccount = loginedAccount;
        this.loginedName = loginedName;
        this.loginedTime = loginedTime;
    }

    public String getLoginedAccount() {
        return loginedAccount;
    }

    public void setLoginedAccount(String loginedAccount) {
        this.loginedAccount = loginedAccount;
    }

    public String getLoginedName() {
        return loginedName;
    }

    public void setLoginedName(String loginedName) {
        this.loginedName = loginedName;
    }

    public String getLoginedTime() {
        return loginedTime;
    }

    public void setLoginedTime(String loginedTime) {
        this.loginedTime = loginedTime;
    }
}
