package class0807;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

public class TestSetget {
    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        //获取到Student的BeanInfo属性
        BeanInfo stubi = Introspector.getBeanInfo(Student.class) ;
        //获取到所有的属性
        PropertyDescriptor[] pds = stubi.getPropertyDescriptors() ;
        //创建Student对象
        Student stu = new Student() ;
        //遍历属性信息
        for (PropertyDescriptor pd :
                pds) {
            //测试自己定义的属性
            if ("name".equals(pd.getName())){
                //存储值
                pd.getWriteMethod().invoke(stu, "Rose") ;
                //获取值
                System.out.println(pd.getReadMethod().invoke(stu));
            }
            //测试内省机制自加的属性的特点
            System.out.println(pd.getName());
            if ("address".equals(pd.getName())){
                //经过测试我们可以发现，虽然内省机制添加了属性，但是并不会自动添加缺省的get、set方法
//                pd.getReadMethod().invoke(stu,"上海") ;
                System.out.println(pd.getReadMethod().invoke(stu));
            }
        }
    }
}
