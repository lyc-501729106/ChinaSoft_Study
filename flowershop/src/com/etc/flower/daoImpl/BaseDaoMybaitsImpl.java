package com.etc.flower.daoImpl;

import com.etc.flower.dao.BaseDao;
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
 * @Date 2020/11/3 - 9:28
 */
public class BaseDaoMybaitsImpl implements BaseDao {
    //在静态块中 ，添加数据源的关联信息
    static SqlSessionFactory sqlSessionFactory;
    public  SqlSession sqlSession;

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

    @Override
    public void openDb() throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
        if (sqlSessionFactory != null)
            sqlSession = sqlSessionFactory.openSession(true);
    }

    @Override
    public void closeResource() throws SQLException {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Override
    public void openTransaction() throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        if (sqlSession == null)
            sqlSession = sqlSessionFactory.openSession();//取消自动提交，即打开事务
    }

    @Override
    public void commitTransaction() throws SQLException {
        if (sqlSession != null)
            sqlSession.commit();//事务提交
    }

    @Override
    public void rollbackTransaction() throws SQLException {
        if (sqlSession != null)
            sqlSession.rollback();//事务回滚！！
    }
}
