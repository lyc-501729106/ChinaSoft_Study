package com.etc.myshop.daoImpl;

import com.etc.myshop.dao.UserDao;
import com.etc.myshop.entity.TUser;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    @Override
    public TUser login(String uname, String pwd) throws ClassNotFoundException, SQLException, URISyntaxException, IOException {
        String sql = "select * from tuser where uname = '"+uname+"' and pwd = '"+pwd+"'";
        st = con.createStatement();
        rs = st.executeQuery(sql);
        TUser tUser = null;
        if (rs.next()){
            tUser = new TUser();
            tUser.setUname(rs.getString("uname"));
            tUser.setPwd(rs.getString(4));
            tUser.setTel(rs.getString("tel"));
            tUser.setRole(rs.getInt("role"));
            tUser.setTuser_id(rs.getInt("tuser_id"));
            tUser.setProduct_id(rs.getInt("product_id"));
        }
        return tUser;
    }
}
