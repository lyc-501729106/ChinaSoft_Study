package mystudentsystem.ui;


import mystudentsystem.entity.Student;
import mystudentsystem.serviceImpl.StudentServiceFansheImpl;
import mystudentsystem.util.JudgeNo;
import mystudentsystem.util.JudgePwd;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Menu {

        Scanner input = new Scanner(System.in) ;
        JudgeNo nextInt = new JudgeNo() ;

        public void startMenu(){
                        System.out.println("------------学生管理系统------------");
                        System.out.println("|             1.登录               |");
                        System.out.println("|             2.注册               |");
                        System.out.println("|             3.退出               |");
                        System.out.println("-----------------------------------");

        }

        public void startLogin() throws NoSuchMethodException, NoSuchFieldException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
        JudgeNo nextInt = new JudgeNo() ;

            System.out.println("--------------------------");
            System.out.println("-请选择身份登录            ");
            System.out.println("        1.班长登录        ");
            System.out.println("        2.组长登录        ");
            System.out.println("        3.组员登录        ");
            System.out.println("--------------------------");
            System.out.print("请输入:");
            int index = nextInt.judge() ;
            if (index == 1){
                RoleEnumImpl.values()[0].roleMenu();
            }else if (index == 2){
                RoleEnumImpl.values()[1].roleMenu();
            }else if (index == 3){
                RoleEnumImpl.values()[2].roleMenu();
            }else {
                System.out.println("输入有误！");
            }

    }
        public void startRegist() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student stu = new Student() ;
        JudgeNo nextInt = new JudgeNo() ;//判断是否为数字的工具
        JudgePwd jP = new JudgePwd() ;
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到注册页！");
        System.out.println("---------------------------");
        System.out.print("用户名：");
        stu.setUname(input.next());
        System.out.print("密码(数字大小写必须有！)：");
        JudgePwd jp = new JudgePwd() ;
        String password = jp.judgepwd() ;

        if (password != null && !"".equals(password)){
            stu.setPwd(password);
        }else {
            System.out.println("数字，大小写缺一不可！");
        }
        StudentServiceFansheImpl sd = new StudentServiceFansheImpl() ;
        if (sd.regist(stu) != null && (stu.getPwd() != null && !"".equals(stu.getPwd()))){
            System.out.println("注册成功！");
        }else {
            System.out.println("注册失败！");
        }


        System.out.println("---------------------------");
    }
}
