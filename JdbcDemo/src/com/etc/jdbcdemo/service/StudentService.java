package com.etc.jdbcdemo.service;

import com.etc.jdbcdemo.entity.Student;
import com.etc.jdbcdemo.entity.Tclass;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    //登录功能
    public Student login(String username , String pwd) throws SQLException;
    //查询所有学生信息
    public List<Student> getAll() throws SQLException, ClassNotFoundException;
    //注册功能
    public int regist(Student stu) throws SQLException, ClassNotFoundException;
    //删除功能
    public int del(String username) throws SQLException;
    //修改密码功能
    public int update(String username , String pwd) throws SQLException;
    //查询班级学生信息
    public List<Tclass> getClassStudent() throws SQLException;
}
