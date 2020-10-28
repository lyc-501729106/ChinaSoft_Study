package mystudentsystem.serviceImpl;


import mystudentsystem.daoImpl.StudentDaoFansheImpl;
import mystudentsystem.entity.Student;
import mystudentsystem.service.StudentService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentServiceFansheImpl implements StudentService {
    Class cla = StudentDaoFansheImpl.class ;//创建Class对象

    @Override
    public boolean login(String uname, String pwd) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Constructor con = cla.getConstructor() ;
        StudentDaoFansheImpl s = (StudentDaoFansheImpl) cla.newInstance() ;
        Method method = cla.getDeclaredMethod("login", new Class[] {String.class , String.class}) ;
        return (boolean) method.invoke(s ,new Object[] {uname , pwd});
    }

    @Override
    public String regist(Student stu) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        StudentDaoFansheImpl s = (StudentDaoFansheImpl) cla.newInstance() ;
        Method method = cla.getDeclaredMethod("regist", new Class[] {Student.class}) ;
        return (String) method.invoke(s , new Object[] {stu});
    }

    @Override
    public boolean insertName(Student stu) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        StudentDaoFansheImpl s = (StudentDaoFansheImpl) cla.newInstance() ;
        Method method = cla.getDeclaredMethod("insertName",new Class[] {Student.class}) ;
        return (boolean)method.invoke(s,new Object[] {stu}) ;
    }

    @Override
    public boolean selectName(String name) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        StudentDaoFansheImpl s = (StudentDaoFansheImpl) cla.newInstance() ;
        Method method = cla.getDeclaredMethod("selectName", new Class[] {String.class}) ;
        return (boolean) method.invoke(s,new Object[] {name});
    }

    @Override
    public boolean updataName(String name, Student student) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        StudentDaoFansheImpl s = (StudentDaoFansheImpl) cla.newInstance() ;
        Method method = cla.getDeclaredMethod("updataName", new Class[] {String.class , Student.class}) ;
        return (boolean) method.invoke(s,new Object[] {name , student});
    }

    @Override
    public boolean delName(String name) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        StudentDaoFansheImpl s = (StudentDaoFansheImpl) cla.newInstance() ;
        Method method = cla.getDeclaredMethod("delName" , new Class[] {String.class}) ;
        return (boolean) method.invoke(s ,new Object[] {name});
    }
}
