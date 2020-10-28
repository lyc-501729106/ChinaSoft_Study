package class0807;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

//内省-> Student中没有相关属性，只有get或者set方法，java会认为有相关属性，这种叫内省
public class TestNeiXing {
    public static void main(String[] args) throws IntrospectionException {
        //通过内省对象得到Student的Bean信息
        BeanInfo beanInfo = Introspector.getBeanInfo(Student.class) ;
        //通过当前的Bean信息获取到所有的属性
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors() ;
        //遍历所有属性，得到所有的属性名称
        for (PropertyDescriptor pro :
                propertyDescriptors) {
            System.out.println(pro.getName() + " ");
        }
        System.out.println("----------");
        Class stuc = Student.class ;
        Field[] f = stuc.getDeclaredFields() ;
        for (Field field :
                f) {
            System.out.println(field);
            System.out.println(f);
        }
    }
}
