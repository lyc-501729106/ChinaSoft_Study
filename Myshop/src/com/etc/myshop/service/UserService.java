package com.etc.myshop.service;

import com.etc.myshop.entity.TUser;

import java.sql.SQLException;

public interface UserService {
    public TUser login(String uname , String pwd) throws SQLException;
}
