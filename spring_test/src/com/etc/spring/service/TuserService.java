package com.etc.spring.service;

import com.etc.spring.dao.TuserDao;
import com.etc.spring.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/10/28 - 10:39
 */
public class TuserService {
    private TuserDao tuserDao;

    public TuserDao getTuserDao() {
        return tuserDao;
    }

    public void setTuserDao(TuserDao tuserDao) {
        this.tuserDao = tuserDao;
    }

    public List<Student> students(){
        List<Student> students = null;
        try {
            students = tuserDao.students();
        } catch (Exception e) {
            e.printStackTrace();
            //日志
        }
        return students;
    }
    public void addStudent(){
        for (int i = 7; i < 20; i++) {
            if (i == 15) throw new RuntimeException(); //测试spring的事务！主动抛异常。注意不能 try catch
            tuserDao.addUser(i,"sdf");
        }
    }
}
