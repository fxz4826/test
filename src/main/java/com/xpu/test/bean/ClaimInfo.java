package com.xpu.test.bean;

public class ClaimInfo {
    private String businessNum;
    private String adminAccount;
    private String conAccount;
    private String policNum;
    private String claimMoney;
    private String policyMSG;

    public ClaimInfo() {
    }

    public ClaimInfo(String businessNum, String adminAccount, String conAccount, String policNum, String claimMoney, String policyMSG) {
        this.businessNum = businessNum;
        this.adminAccount = adminAccount;
        this.conAccount = conAccount;
        this.policNum = policNum;
        this.claimMoney = claimMoney;
        this.policyMSG = policyMSG;
    }

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getConAccount() {
        return conAccount;
    }

    public void setConAccount(String conAccount) {
        this.conAccount = conAccount;
    }

    public String getPolicNum() {
        return policNum;
    }

    public void setPolicNum(String policNum) {
        this.policNum = policNum;
    }

    public String getClaimMoney() {
        return claimMoney;
    }

    public void setClaimMoney(String claimMoney) {
        this.claimMoney = claimMoney;
    }

    public String getPolicyMSG() {
        return policyMSG;
    }

    public void setPolicyMSG(String policyMSG) {
        this.policyMSG = policyMSG;
    }

    @Override
    public String toString() {
        return "ClaimInfo{" +
                "businessNum='" + businessNum + '\'' +
                ", adminAccount='" + adminAccount + '\'' +
                ", conAccount='" + conAccount + '\'' +
                ", policNum='" + policNum + '\'' +
                ", claimMoney='" + claimMoney + '\'' +
                ", policyMSG='" + policyMSG + '\'' +
                '}';
    }
}
