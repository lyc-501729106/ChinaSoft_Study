package com.etc.myshop.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.sql.SQLException;

/**
 * @Author 吕译辰
 * @Date 2020/11/3 - 19:21
 */
public class BaseDao {
    static SqlSessionFactory sqlSessionFactory;
    public SqlSession sqlSession;

    static {
        String resource = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    //打开数据库
    public void openDB() {
        if (sqlSessionFactory != null) {
            sqlSession = sqlSessionFactory.openSession(true);
        }
    }

    public void closeResource() throws SQLException {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    public void openTransaction() throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        if (sqlSession == null)
            sqlSession = sqlSessionFactory.openSession();//取消自动提交，即打开事务
    }

    public void commitTransaction() throws SQLException {
        if (sqlSession != null)
            sqlSession.commit();//事务提交
    }

    public void rollbackTransaction() throws SQLException {
        if (sqlSession != null)
            sqlSession.rollback();//事务回滚！！
    }
}
