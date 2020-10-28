package com.etc.studentsystem.ui;

import com.etc.studentsystem.entity.Student;
import com.etc.studentsystem.service.DataService;
import com.etc.studentsystem.service.StudentService;
import com.etc.studentsystem.util.JudgeNo;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import java.util.Scanner;

public class Test {
    //获取到一个数字
    public void getNo(){
        DataService service = new DataService() ;
        System.out.println("得到你了：" + service.getNo()); ;
    }
    //注册功能
    public void regiest(){
        System.out.println("请输入用户名：");
        Scanner input = new Scanner(System.in) ;
        Student student = new Student() ;
        student.setName(input.next());
        System.out.println("请输入密码");
        //特殊功能是需要的时候调用，如下方数字判断，只要是需要输入数字的时候调用此方法
        student.setPwd(JudgeNo.judge());
        //UI层只是调用逻辑层信息
        StudentService service = new StudentService() ;
        service.regist(student);
    }
    //登录功能
    public void login(){
        System.out.println("请输入用户名：");
        String name = "hello" ;
        System.out.println(name );
        System.out.println("请输入密码：");
        int pwd = 111 ;
        System.out.println(pwd);
        StudentService service = new StudentService() ;
        //基本数据类型与引用数据类型的String做参数，对象做返回值
       /* Student stu = service.login(name , pwd) ;

        if(stu == null){
            System.out.println("登录失败，用户名或者密码错误");
        }else{
            System.out.println("登录成功，欢迎进入***系统！！！！");
        }*/
        //实现登录用对象Student做参数，布尔类型做返回值
        Student stu = new Student() ;
        stu.setName(name);
        stu.setPwd(pwd);
        boolean flag = false ;
        //判空最早的位置在前端使用JS或者JQUERY
        //做为后端的程序员来说第一个判空的位置就在C/S结构的UI层，在B/S结构的控制层
        //如果没有在控制层进行判断，那么必须要在持久层发送请求到服务器端的之前进行判断
        if(stu != null && !"".equals(stu))
        flag = service.login(stu) ;
        if(flag){
            System.out.println("OK的");
        }else{
            System.out.println("NO的");
        }
    }
    public static void main(String[] args) {
        // main方法只能是程序的入口，即main只是一个入口的调用
       //  new Test().getNo();
       //测试登录功能
        //new Test().login();
        //测试注册功能
        new Test().regiest();
    }
}
