package jdbcdemo.ui;

import jdbcdemo.entity.Student;
import jdbcdemo.entity.Studentnew;
import jdbcdemo.entity.Tclass;
import jdbcdemo.service.StudentService;
import jdbcdemo.serviceImpl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    ApplicationContext context = new
            ClassPathXmlApplicationContext("jdbc.xml");
    //查看所有学生信息
    public void getAll() throws SQLException, ClassNotFoundException {
        System.out.println("查询所有学生信息");
        StudentService ss = (StudentService) context.getBean("studentService");
        List<Student> list = ss.getAll();
        int size = list.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                Student stu = list.get(i);
                if (stu != null) {
                    System.out.println(
                            "序号:" + stu.getSid() + "\n" +
                                    "用户名:" + stu.getStuname() + "\n" +
                                    "密码:" + stu.getPwd() + "\n" +
                                    "年龄:" + stu.getAge() + "\n"
                    );
                } else {
                    System.out.println("查无此人!");
                }
            }
        }
    }

    //实现登录功能
    public void login() throws SQLException {
        System.out.println("请输入用户名:");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("请输入密码:");
        String pwd = input.next();
        StudentService ss = (StudentService) context.getBean("studentService");
        Student stu = ss.login(name, pwd);
        if (stu != null) {
            System.out.println("用户名:" +
                    stu.getStuname() + "\n" +
                    "密码:" +
                    stu.getPwd() + "\n" +
                    "年龄:" +
                    stu.getAge() + "\n" +
                    "序号:" +
                    stu.getSid() + "\n");
        } else {
            System.out.println("查无此人！");
        }

    }

    //实现注册功能
    public void regist() throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        System.out.println("请输入用户名:");
        Scanner input = new Scanner(System.in);
        Student stu = (Student) context.getBean("student");
        stu.setStuname(input.next());
        System.out.println("请输入年龄:");
        stu.setAge(input.nextInt());
        System.out.println("请输入密码:");
        stu.setPwd(input.next());
        StudentService ss = (StudentService) context.getBean("studentService");
        int num = ss.regist(stu);
        if (num > 0) {
            System.out.println("插入了" +
                    num +
                    "条记录");
        } else {
            System.out.println("插入失败！");
        }
    }

    public void del() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        StudentService ss = (StudentService) context.getBean("studentService");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要删除的账号：");
        int num = ss.del(input.next());
        if (num > 0) {
            System.out.println("删除了" + num + "个信息！");
        } else {
            System.out.println("删除失败！");
        }
    }

    public void update() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        StudentService ss = (StudentService) context.getBean("studentService");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要修改密码的账号：");
        String username = input.next();
        System.out.print("请输入新的密码：");
        String pwd = input.next();
        int num = ss.update(username, pwd);
        if (num > 0) {
            System.out.println("修改密码成功！");
        } else {
            System.out.println("修改失败！");
        }
    }

}
