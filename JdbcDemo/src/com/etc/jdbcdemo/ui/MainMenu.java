package com.etc.jdbcdemo.ui;

import com.etc.jdbcdemo.entity.Student;
import com.etc.jdbcdemo.entity.Studentnew;
import com.etc.jdbcdemo.entity.Tclass;
import com.etc.jdbcdemo.service.StudentService;
import com.etc.jdbcdemo.serviceImpl.StudentServiceImpl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    //查询学生班级信息
    public void getClassStudent() throws SQLException {
        StudentService ss = new StudentServiceImpl();
        List<Tclass> tclasses = ss.getClassStudent();
        for (Tclass tc :
                tclasses) {
            System.out.println("班级:" + tc.getTclassname() +
                    "班级ID:" + tc.getTclass_id()
                    );
            for (Studentnew stu :
                    tc.getStudentnewList()) {
                System.out.println("姓名:" + stu.getSname()+
                        "学生年龄:" + stu.getAge()
                );
            }

        }
    }
    //添加学生班级信息
    public void addStudentClass() throws SQLException {
        Tclass tc = new Tclass("java2班");
        Studentnew stu1 = new Studentnew(tc,"木无表情" , 20 , new Date(),90.9);
        StudentService ss = new StudentServiceImpl();
        int no = ((StudentServiceImpl)ss).addStudentClass(stu1);
        if (no > 0) System.out.println("添加成功！");
        else System.out.println("添加失败！");
    }
    //删除学生及班级
    public void delStudentClass() throws SQLException {
        StudentService ss = new StudentServiceImpl();
        int no = ((StudentServiceImpl)ss).delStudentClass();
        if (no > 0) System.out.println("删除成功！");
        else System.out.println("删除失败！");
    }
    //添加班级学生的信息
    public void addClassStudent() throws SQLException {
        Tclass tc = new Tclass("java2班");
        //学生信息
        Studentnew stu1 = new Studentnew(tc,"不困了" , 20 , new Date(),90.9);
//        Studentnew stu2 = new Studentnew(tc,"特别困" , 30 , new Date(),90.6);
//        Studentnew stu3 = new Studentnew(tc,"月亮不睡我不睡" , 25 , new Date(),88.2);
        StudentService ss = new StudentServiceImpl();
        int no = ((StudentServiceImpl)ss).addClassStudent(tc);
        if (no > 0) System.out.println("添加成功！");
        else System.out.println("添加失败！");
    }
    //查看所有学生信息
    public void getAll() throws SQLException, ClassNotFoundException {
        System.out.println("查询所有学生信息");
        StudentService ss = new StudentServiceImpl() ;
        List<Student> list = ss.getAll() ;
        int size = list.size() ;
        if (size > 0){
            for (int i = 0; i < size; i++) {
                Student stu = list.get(i) ;
                if (stu != null){
                    System.out.println(
                                    "序号:" + stu.getSid() + "\n" +
                                    "用户名:" + stu.getStuname() + "\n" +
                                    "密码:" + stu.getPwd() + "\n" +
                                    "年龄:" + stu.getAge() + "\n"
                            );
                }else {
                    System.out.println("查无此人!");
                }
            }
        }
    }
    //实现登录功能
    public void login() throws SQLException {
        System.out.println("请输入用户名:");
        Scanner input = new Scanner(System.in) ;
        String name = input.next() ;
        System.out.println("请输入密码:");
        String pwd = input.next() ;
        StudentService ss = new StudentServiceImpl() ;
        Student stu = ss.login(name , pwd) ;
        if (stu != null){
            System.out.println("用户名:" +
                    stu.getStuname() + "\n" +
                    "密码:" +
                    stu.getPwd() + "\n" +
                    "年龄:" +
                    stu.getAge() + "\n" +
                    "序号:" +
                    stu.getSid() + "\n");
        }else {
            System.out.println("查无此人！");
        }

    }
    //实现注册功能
    public void regist() throws SQLException, ClassNotFoundException {
        System.out.println("请输入用户名:");
        Scanner input = new Scanner(System.in) ;
        Student stu = new Student() ;
        stu.setStuname(input.next());
        System.out.println("请输入年龄:");
        stu.setAge(input.nextInt());
        System.out.println("请输入密码:");
        stu.setPwd(input.next());
        StudentService ss = new StudentServiceImpl() ;
        int num = ss.regist(stu) ;
        if (num > 0){
            System.out.println("插入了" +
                    num +
                    "条记录");
        }else {
            System.out.println("插入失败！");
        }
    }
    public void del() throws SQLException {
        StudentService ss = new StudentServiceImpl() ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("请输入要删除的账号：");
        int num = ss.del(input.next()) ;
        if (num > 0 ){
            System.out.println("删除了" + num + "个信息！");
        }else {
            System.out.println("删除失败！");
        }
    }
    public void update() throws SQLException {
        StudentService ss = new StudentServiceImpl() ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("请输入要修改密码的账号：");
        String username = input.next() ;
        System.out.print("请输入新的密码：");
        String pwd = input.next() ;
        int num = ss.update(username , pwd) ;
        if (num > 0 ){
            System.out.println("修改密码成功！");
        }else {
            System.out.println("修改失败！");
        }
    }

}
