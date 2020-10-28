package com.etc.myshop.daoImpl;



import com.etc.myshop.dao.BaseDao;
import com.etc.myshop.util.DbInfo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;

public class BaseDaoImpl implements BaseDao {
    //定义所有数据库对象
    public Connection con ;
    public PreparedStatement ps ;
    public ResultSet rs ;
    public Statement st ;
    //打开数据库
    public void openDb() throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
        //创建DbInfo实例
        DbInfo dbInfo = DbInfo.getInstance() ;
        //获取ConfigInfo实例
        DbInfo.ConfigInfo configInfo = dbInfo.getProperties() ;
        Class.forName(configInfo.getDbdriver()) ;
        con = DriverManager.getConnection(configInfo.getDbURL() , configInfo.getUname() , configInfo.getPwd()) ;
        /*//添加驱动 MySql 8 要加cj
        Class.forName("com.mysql.cj.jdbc.Driver") ;
        //数据库的连接 ,连接完会返回一个对象 characterEncoding=utf-8
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademo?useSSL=false&serverTimezone=CST" , "root" , "root") ;
        */
    }
    //关闭资源
    public void closeResource() throws SQLException {
        //关闭资源
        if (con != null) con.close();
        if (ps != null) ps.close();
        if (rs != null) rs.close();
        if (st != null) st.close();
    }

    @Override
    public void openTransaction() throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        //所谓的打开事务，其实就是将之前的打开数据库的自动提交功能改为false
        openDb();
        if (con != null){
            con.setAutoCommit(false);
        }
    }
    //提交事务，
    @Override
    public void commitTransaction() throws SQLException {
        if (con != null){
            con.commit();
        }
    }
//回滚事务
    @Override
    public void rollbackTransaction() throws SQLException {
        if (con != null){
            con.rollback();
        }
    }

}
