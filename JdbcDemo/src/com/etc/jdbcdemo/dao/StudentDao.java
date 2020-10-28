package com.etc.jdbcdemo.dao;

import com.etc.jdbcdemo.entity.Student;
import com.etc.jdbcdemo.entity.Studentnew;
import com.etc.jdbcdemo.entity.Tclass;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    public Student login(String username, String pwd) throws ClassNotFoundException, SQLException, IOException, URISyntaxException;

    public List<Student> getAll() throws ClassNotFoundException, SQLException, IOException, URISyntaxException;

    public int regist(Student stu) throws SQLException, ClassNotFoundException, IOException, URISyntaxException;

    public int del(String username) throws SQLException, ClassNotFoundException, IOException, URISyntaxException;
    public int update(String username , String pwd) throws SQLException, ClassNotFoundException, IOException, URISyntaxException;

    public int addClass(Tclass tclass) throws SQLException, URISyntaxException, IOException, ClassNotFoundException;

    public int addStudent(Studentnew stu) throws SQLException, URISyntaxException, IOException, ClassNotFoundException;
    //获取班级学生信息
    List<Tclass> getClassStudent() throws ClassNotFoundException, SQLException, URISyntaxException, IOException;

}
