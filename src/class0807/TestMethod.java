package class0807;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //创建Class对象
        Class stuc = Student.class ;
        //创建Student实例
        Student stu = (Student) stuc.newInstance();
        //获取到所有的public方法
        Method[] ms = stuc.getMethods() ;
        for (Method method :
                ms) {
            System.out.println(method.getName());
        }
        System.out.println("------declare-----------");
        //获取到所有的声明的方法 -> 只打印自己写的
        ms = stuc.getDeclaredMethods() ;
        for (Method method :
                ms) {
            System.out.println(method.getName());
        }
        System.out.println("-------------------------");
        //获取到对应的方法
        Method method = stuc.getDeclaredMethod("show" , new Class[] {String.class , int.class}) ;
        //调用方法
        method.invoke(stu , new Object[] {"hello" , 22}) ; //invoke方法 为实参！
        System.out.println("-----------");
        stu.show("hello2" , 33); //这种不叫反射
    }
}
