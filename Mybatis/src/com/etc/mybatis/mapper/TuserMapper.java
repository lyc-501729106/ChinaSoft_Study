package com.etc.mybatis.mapper;

import com.etc.mybatis.entity.Flower;
import com.etc.mybatis.entity.Tuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 11:46
 */
public interface TuserMapper {
    //添加用户信息
    public void addTuser(String uname, int age);

    //删除用户信息
    int deleTuser(String uname);

    //查询某个用户信息
    Tuser getOne(int tuserid);

    //测试对象做参数
    List<Tuser> getSome(Tuser tuser);

    //测试resultMap，以Flower为基准对象
    List<Flower> getShopCarl();

    //测试choose
    List<Flower> getF(@Param("fname") String fname, @Param("type") String type);
}
