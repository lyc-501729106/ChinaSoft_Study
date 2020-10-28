package com.etc.studentsystem.service;

import com.etc.studentsystem.dao.StudentDao;
import com.etc.studentsystem.entity.Student;

public class StudentService {
    //实现注册功能
    public void regist(Student student){
        StudentDao dao = new StudentDao() ;
        dao.regist(student) ;
    }
    //实现登录功能
    public boolean login(Student stu) {
        StudentDao dao = new StudentDao() ;
        return  dao.login(stu) ;
    }
}
