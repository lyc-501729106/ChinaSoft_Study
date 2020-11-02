package com.etc.mybatis.service;

import com.etc.mybatis.entity.Tuser;
import com.etc.mybatis.mapper.BaseDao;
import com.etc.mybatis.mapper.TuserMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 11:48
 */
public class TuserService extends BaseDao {
    //查询用户信息
    public Tuser getOne(int tuserid) {
        open();
        TuserMapper tuserMapper = sqlSession.getMapper(TuserMapper.class);
        Tuser tuser = tuserMapper.getOne(tuserid);
        closeResource();
        return tuser;
    }

    //删除用户信息
    public int deleTuser(String uname) {
        open();
        TuserMapper tuserMapper = sqlSession.getMapper(TuserMapper.class);
        int no = tuserMapper.deleTuser(uname);
        closeResource();
        return no;
    }

    //添加用户信息
    public void addTuser(String uname, int age) {
        //打开数据库
        open();
        //先从session 中获取到接口
        TuserMapper tuserMapper = sqlSession.getMapper(TuserMapper.class);
        //调用需要执行的功能方法
        tuserMapper.addTuser(uname, age);
        //关闭数据库
        closeResource();
    }
}
