package com.etc.studentsystem.dao;

import com.etc.studentsystem.entity.Student;



public class StudentDao {

    static Student [] stu ;
   /* {
        System.out.println("我是一个普通块");
    }*/
   //定义一个下标变量
    int i = 2 ;
    static {
        stu = new Student[10] ;
        System.out.println("我是一个静态块");
        stu[0] = new Student("admin" , 123 ) ;
        stu[1] = new Student("HAHA" , 20) ;
    }
    public Student login(String name, int pwd) {
        //定义一个对象为null
        Student stu = null ;
        if("hello".equals(name) && pwd == 111)
            stu = new Student();//当用户名与密码都正确的时候，创建对象，即当前的对象不为null
        return stu ;
    }

    public boolean login(Student stu) {
        //当参数数量少的时候我们选择传递参数，当参数的数量多的时候，我们就可以考虑传递对象
        //通过案例我们可以看到，对象做为参数可以在获取到客户的信息后将信息存储到Student对象中，然后传递对象即可
        //需要在持久层获取到内容的时候就可以使用对象.get***()的方式来获取
        if("hello".equals(stu.getName()) && stu.getPwd() == 111)
            return true ;
        else
            return  false ;
    }
   //定义方法的时候是根据功能来定义，根据功能来写方法名，参数列表就是需要告诉服务端的信息，信息就可以使用对象或者是基本参数来实现
    /**
     * 实现注册功能
     * @param student
     */
    public void regist(Student student) {
        //注册功能其实就是将用户输入的对象信息存储到数组中
        //因为数组是按照的位置进行存储，所以我们只需要得到当前的下标位置进行存储即可
        if(i <= 9 ) {
            //我们一般遇到对象操作的时候都先要进行一个判空操作
            if(student != null && !"".equals(stu)){
                stu[i] = student;
                //添加一条信息，则下标需要下移
                i++;
            }

        }else {
            System.out.println("对不起，班级人数已满，不能再添加啦！！！");
        }
    }
}
