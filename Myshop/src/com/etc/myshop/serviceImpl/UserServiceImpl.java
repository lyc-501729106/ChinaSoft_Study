package com.etc.myshop.serviceImpl;

import com.etc.myshop.dao.UserDao;
import com.etc.myshop.daoImpl.UserDaoImpl;
import com.etc.myshop.entity.TUser;
import com.etc.myshop.service.UserService;
import com.etc.myshop.util.Log;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public TUser login(String uname, String pwd) throws SQLException {
        UserDao dao = new UserDaoImpl();
        TUser tUser = null;
        try {
            ((UserDaoImpl)dao).openTransaction();
            tUser = dao.login(uname, pwd);
            ((UserDaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage() + "登录出错！");
            ((UserDaoImpl) dao).rollbackTransaction();
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return tUser;
    }

}
