package com.etc.mybatis.mapper;

import com.etc.mybatis.entity.Tuser;

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
}
