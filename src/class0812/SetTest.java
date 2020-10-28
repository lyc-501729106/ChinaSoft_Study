package class0812;
/**
 * HashSet() ;没有线程安全。
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet() ;
        set.add("hello") ;
        set.add(222) ;
        set.add("hello") ;
        set.add("333") ;

        Iterator it = set.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("删除前的SIZE:" + set.size());
        set.remove("hello") ;
        System.out.println("删除后的SIZE:" + set.size());
        System.out.println("========student=============");
        Set<Student> stu = new HashSet<>() ;
        Student stu1 = new Student("aaa",20) ;
        Student stu2 = new Student("aaa",20) ;
        Student stu3 = new Student("ccc" ,20) ;
        stu.add(stu1) ;
        stu.add(stu2) ;
        stu.add(stu3) ;
        //内存泄露  使用Set的时候 一定得注意这个问题！
        System.out.println("删除前的SIZE:" + stu.size());
        stu1.setAge(10);
        stu.remove(stu1) ;
        System.out.println("删除后的SIZE:" + stu.size());
        System.out.println("====遍历====");
        Iterator it1 = stu.iterator() ;
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        Student stu4 = new Student("s" , 1);
        Student stu5 = new Student("s" , 1);
        System.out.println("stu4,stu5比较结果为:" + stu4.equals(stu5));
    }
}
