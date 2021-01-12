package com.xpu.test.service;

import com.xpu.test.bean.PolicyInfo;

public interface PolicyInfoService {
    public PolicyInfo selectPolicy(String policyNum);

    public boolean deletePy(String policyNum);

    public boolean addPy(PolicyInfo py);

    public boolean updatePy(PolicyInfo py);
}
