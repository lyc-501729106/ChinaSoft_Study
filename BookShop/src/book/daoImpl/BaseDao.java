package book.daoImpl;

import book.util.DbInfo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;

public class BaseDao implements book.dao.BaseDao {
    //定义所有数据库对象
    public Connection con ;
    public PreparedStatement ps ;
    public ResultSet rs ;
    //打开数据库
    public void openDb() throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
        //创建DbInfo实例
        DbInfo dbInfo = DbInfo.getInstance() ;
        //获取ConfigInfo实例
        DbInfo.ConfigInfo configInfo = dbInfo.getProperties() ;
        Class.forName(configInfo.getDbdriver()) ;
        con = DriverManager.getConnection(configInfo.getDbURL() , configInfo.getUname() , configInfo.getPwd()) ;
        System.out.println("连接成功");
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
    }

    @Override
    public void openTransaction() throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        openDb();
        if (con != null)
            con.setAutoCommit(false);
        System.out.println("事务已打开---");
    }

    @Override
    public void commitTransaction() throws SQLException {
        if (con != null)
            con.commit();
        System.out.println("事务已提交---");
    }

    @Override
    public void rollbackTransaction() throws SQLException {
        if (con != null) con.rollback();
        System.out.println("事务已回滚---");
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException, URISyntaxException, IOException {
        BaseDao bd = new BaseDao();
        bd.openDb();
    }
}
