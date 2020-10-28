package com.etc.myshop.dao;

import com.etc.myshop.entity.TUser;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

public interface UserDao {
    public TUser login(String uname , String pwd) throws ClassNotFoundException, SQLException, URISyntaxException, IOException;
}
