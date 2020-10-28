package class0806;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        //创建Class对象
        Class c = Student.class ;
        //创建Student对象
        Student stu = (Student) c.newInstance();
        //获取到stu对象中的name Filed
        Field f = c.getDeclaredField("name") ;
        //修改属性权限
        f.setAccessible(true);
        //给name属性赋值
        f.set(stu,"rose");
        //查看是否已经正常赋值
        System.out.println(f.get(stu));
    }
}
