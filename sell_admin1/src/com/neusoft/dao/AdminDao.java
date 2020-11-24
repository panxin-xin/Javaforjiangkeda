package com.neusoft.dao;

import com.neusoft.domain.Admin;

public interface AdminDao {
    public Admin getAdminByNameAndPsaaword(String AdminName,String password);

    Admin getAdminByNameAndPassword(String adminName, String password);
}
