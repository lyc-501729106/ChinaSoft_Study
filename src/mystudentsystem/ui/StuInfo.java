package mystudentsystem.ui;

import mystudentsystem.entity.Student;
import mystudentsystem.serviceImpl.StudentServiceFansheImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class StuInfo  {

    Student student ;
//    Student student = new Student() ; 原来的写法 会覆盖上一次存的数据
    Scanner input = new Scanner(System.in) ;
    StudentServiceFansheImpl ss = new StudentServiceFansheImpl() ;
//    StudentService ss = new StudentServiceImpl() ;


    public void infoInsert() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        student = new Student() ;  //每插入一个数据，地址要变一次，所以写在这里。
        System.out.println("输入一个名字：");
        student.setName(input.next());
        if (ss.insertName(student)){
            System.out.println("学生名字存入成功！");
        }
    }
    public void infoSelect() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.print("请输入要查询的名字：");
          String name = input.next();
        if (ss.selectName(name)){
            System.out.println("查出成功！ ->" + name);
        }else {
            System.out.println("查询失败！");
        }
    }
    public void infoUpdate() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.print("请输入要修改的名字：");
        String name = input.next() ;
        System.out.println("请输入该为的目标名");
        student.setNewname(input.next());


        if (ss.updataName(name,student)){
            System.out.println("修改成功");
        }else {
            System.out.println("没有此人！");
        }

    }
    public void infoDel() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.print("请输入要删除的名字：");
        String name = input.next() ;
        if (ss.delName(name)){
            System.out.println("删除成功！");
        }else {
            System.out.println("查无此人！");
        }
    }

}
