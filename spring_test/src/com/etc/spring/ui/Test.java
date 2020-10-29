package com.etc.spring.ui;

import com.etc.spring.entity.Student;
import com.etc.spring.service.TuserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/10/29 - 10:21
 */
public class Test {
    @org.junit.Test
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
        ts.addStudent();
        /*List<Student> students = ts.students();
        for (Student stus :
                students) {
            System.out.println("stuname: " + stus.getStuname());
            System.out.println(stus.getStuid());
        }*/
    }

    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("com/etc/spring/jdbc.xml");
        TuserService ts = (TuserService) context.getBean("tuserService");
        List<Student> students = ts.students();
        for (Student stus :
                students) {
            System.out.println("stuname: " + stus.getStuname());
            System.out.println(stus.getStuid());
        }
    }
}
