package com.etc.mybatis.service;

import com.etc.mybatis.entity.Flower;
import com.etc.mybatis.entity.Tuser;
import com.etc.mybatis.mapper.BaseDao;
import com.etc.mybatis.mapper.TuserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 11:48
 */
public class TuserService extends BaseDao {
    //测试choose动态SQL实现
    //查询鲜花信息：如果鲜花名称不为空，则查询此鲜花
    //如果鲜花种类不为空，则查询此种类的鲜花
    //如果以上两个条件都为空，则查询鲜花数量为999的鲜花
    public List<Flower> getF(String fname, String type) {
        open();
        TuserMapper tuserMapper = sqlSession.getMapper(TuserMapper.class);
        List<Flower> flowers = tuserMapper.getF(fname, type);
        return flowers;
    }

    //测试resultMap
    public List<Flower> getShopCarl() {
        open();
        TuserMapper tuserMapper = sqlSession.getMapper(TuserMapper.class);
        List<Flower> flowers = tuserMapper.getShopCarl();
        sqlSession.close();
        return flowers;
    }

    //测试对象做参数
    public List<Tuser> getSome(Tuser tuser) {
        open();
        //测试对象做参数！实体类和数据库的字段名字 ，相对应，不然有些有值，有些没有值。
        TuserMapper tuserMapper = sqlSession.getMapper(TuserMapper.class);
        List<Tuser> tusers = tuserMapper.getSome(tuser);
        return tusers;
    }

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
