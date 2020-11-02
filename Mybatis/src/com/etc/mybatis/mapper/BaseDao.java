package com.etc.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 11:03
 */
public class BaseDao {
    static SqlSessionFactory sqlSessionFactory;
    public static SqlSession sqlSession;
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
    public void open() {
        if (sqlSessionFactory != null)
            sqlSession = sqlSessionFactory.openSession(true);
    }

    //关闭数据库
    public void closeResource() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
