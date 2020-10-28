package mystudentsystem.service;

import mystudentsystem.entity.Student;

import java.lang.reflect.InvocationTargetException;

public interface StudentService {
    public boolean login(String uname , String pwd) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException;//约定！
    public String regist(Student stu) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException;
    public boolean insertName(Student stu) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
    public boolean selectName(String name) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
    public boolean updataName(String name, Student student) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
    public boolean delName(String name) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

}
