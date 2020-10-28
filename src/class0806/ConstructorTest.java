package class0806;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //创建Student对象
        Student stu = new Student() ; //使用非反射技术实现
        stu.show();

        //使用反射技术创建对象
        Class c = Student.class ;
        stu = (Student) c.newInstance() ;
        stu.show() ;

        System.out.println("-----");
        ((Student) c.newInstance()).show();
        //获取到所有的公共Constructor对象
        Constructor [] cs = c.getConstructors() ;
        for (Constructor cc :
                cs) {
            System.out.println(cc.getName());
        }
        System.out.println("---------------");
        //获取到所有的声明的Constructor对象
        cs = c.getDeclaredConstructors() ;
        for (Constructor cc :
                cs) {
            System.out.println(cc.getName());
        }
        System.out.println("-----------测试构造方法----------");
        //没有使用反射之前创建对象调用有参方法
        stu = new Student("rose" ,11) ;
        System.out.println(stu.getAge() + "  " + stu.getName());

        System.out.println("-------------使用反射实现----------");
        //找到对应的Constructor对象
        Constructor constructor = c.getConstructor(new Class[] {String.class ,int.class}) ;
        //创建Student实例
        stu = (Student) constructor.newInstance(new Object[] {"jack" ,22}) ;
        System.out.println(stu.getAge() + "  " + stu.getName());

    }


}
