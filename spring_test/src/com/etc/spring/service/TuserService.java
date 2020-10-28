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

    @Test
    public void test() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("com/etc/spring/jdbc.xml");
        TuserService ts = (TuserService) context.getBean("tuserService");
//        ts.getTuserDao().addUser(); //添加
//        ts.getTuserDao().updateUser("22",4); //修改
//        ts.getTuserDao().delstu(4);   //删除
        /*Student student = ts.getTuserDao().seletStu();  //查询
        System.out.println("stuname:" + student.getStuname());
        System.out.println("stuid:" + student.getStuid());*/

        List<Student> students = ts.students();
        for (Student stus :
                students) {
            System.out.println("stuname: " + stus.getStuname());
            System.out.println(stus.getStuid());
        }
    }
}
