package class0811;
/**
 * list.add() ;
 * list.size() ;
 * list.get() ;
 */

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //定义一个list集合
        List list = new ArrayList() ; //定义一个大小为10的 Object[]

        Student stu = new Student() ;
        stu.setAge(100);
        stu.setName("tom");

        list.add(stu) ;
//        list.remove("aaa") ; //两种删除方式， 根据下标 和 对象 来删除
//        list.remove(6) ;
//        System.out.println(list.get(4));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i) ;
            if (obj instanceof Student){
                System.out.println(((Student) obj).getAge() +" " + ((Student) obj).getName());
            }else {
                System.out.println(obj.toString());
            }
        }

    }
}
