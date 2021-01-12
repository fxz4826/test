package com.xpu.test.service;

import com.xpu.test.bean.AdminInfo;

public interface AdminService {
    public boolean adminRegist(AdminInfo admin);

    public AdminInfo adminLogin(AdminInfo admin);

    public boolean delete(String conAccount);

    public boolean update(AdminInfo adminInfo);
}
