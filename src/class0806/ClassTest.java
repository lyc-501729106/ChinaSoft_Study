package class0806;

import java.lang.reflect.Field;

public class ClassTest {
    public static void main(String[] args) {
        //获取到Student对象
        Class stuc = Student.class ;
        //获取到所有声明的属性
        Field[] fs1 = stuc.getDeclaredFields() ;
        for (Field f:
             fs1) {
            System.out.println(f);
        }
        System.out.println("-----------");
        //获取所有的public属性
        Field[] fs = stuc.getFields() ;
        for (Field f :
                fs) {
            System.out.println(f);
        }


        //第一种创建Class对象的方式
        Class c = ClassTest.class ;
        //第二种方式
        try {
            c = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第三种方式
        ClassTest ct = new ClassTest() ;
        c = ct.getClass() ;
        //第四种方式 包装类.TYPE
        c = Integer.TYPE ;
    }
}
