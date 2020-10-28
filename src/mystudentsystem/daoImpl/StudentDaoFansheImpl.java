package mystudentsystem.daoImpl;

import mystudentsystem.dao.StudentDao;
import mystudentsystem.entity.Student;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDaoFansheImpl implements StudentDao {
    static List<Student> list = new ArrayList() ;
    static Student[] stu ;
    static int i = 0 ;
    static Constructor con = null;
    static{
        Class stuc = Student.class ;
        stu = new Student[200] ;
        try {
            con = stuc.getConstructor(new Class[] {String.class , String.class});
            Student s0 = (Student)con.newInstance(new Object[] {"admin" , "123"});
            Student s1 = (Student)con.newInstance(new Object[] {"jack" , "123"});
            Student s2 = (Student)con.newInstance(new Object[] {"tom" , "123"});
            stu[0] = s0 ;
            stu[1] = s1 ;
            stu[2] = s2 ;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean insertName(Student student) {
        for (int j = 3; j < stu.length; j++ ) {
            if (stu[j] == null ) {
                stu[j] = student ;
                System.out.println("存入成功，第" +j + "下标");
                return true ;
            }
        }
        return false;
    }
    //集合的方式实现存名字
    /*public boolean insertName(Student student) {
        return list.add(student);
    }*/

    @Override
    public boolean selectName(String name) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null){
                System.out.println(i + " -> " + stu[i].getName());
                if (name.equals(stu[i].getName())){
                    System.out.println("查询成功！");
                    return true ;
                }
            }
        }
        return false ;
    }
    //集合的方式查询存入名字
    /*public boolean selectName(String name) {
        for (Student student :
                list) {
                if (student != null)
                if (student.getName().equals( name)) {
                    System.out.println(student.getName());
                    return true;
                }
        }
        return false ;
    }*/

    @Override
    public boolean delName(String name) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null){
                if (name.equals(stu[i].getName())){
                    stu[i].setName(null);
                    return true ;
                }
            }
        }
        return false ;
    }

    @Override
    public String regist(Student student) {
        if (i <= stu.length){
            for (int j = 0; j < stu.length; j++) {
                //判空操作
                if (stu[j] == null){
                    stu[j] = student ;
                    break ;
                }
            }
        }else {
            System.out.println("注册人数已达到上限！");
        }
        return Arrays.toString(stu);
    }

    @Override
    public boolean login(String uname, String pwd) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null){
                if (uname.equals(stu[i].getUname()) && pwd.equals(stu[i].getPwd())){
                    return true ;
                }
            }
        }
        return false;
    }
    @Override
    public boolean updataName(String name, Student student) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null){
                if (name.equals(stu[i].getName())){
                    stu[i].setName(student.getNewname());//重新赋值
                    return true ;
                }else {

                }
            }
        }
        return false ;
    }
    public void seriOut() throws IOException, ClassNotFoundException {
        File file = new File("./src/mystudentsystem/daoImpl/StuInfo.txt") ;
        //序列化
        FileOutputStream fout = new FileOutputStream(file) ;
        ObjectOutputStream oout = new ObjectOutputStream(fout) ;//序列化
        for (int i = 3; i < stu.length; i++) {
            /*if (stu[i] != null ){
                oout.writeObject(stu[i]);
            }*/
            if (stu[i] != null) //判断有没有这个对象数组
            if (stu[i].getName() != null || stu[i].getPwd() != null || stu[i].getUname() != null){
                oout.writeObject(stu[i]);
            }
        }
        oout.flush();
        oout.close();
        fout.flush();
        fout.close();
    }
    public void seriIn() throws IOException, ClassNotFoundException {
        //反序列化
        File file = new File("./src/mystudentsystem/daoImpl/StuInfo.txt") ;
        FileInputStream fin = new FileInputStream(file) ;
        ObjectInputStream oin = new ObjectInputStream(fin);
        int i = 3 ;
        while (fin.available() > 0){
            Object object = oin.readObject();
            System.out.println(object.toString());
            if (stu[i] == null ){
                stu[i] = (Student) object ;
            }
            i++;
        }
        oin.close();
        fin.close();
    }
}
