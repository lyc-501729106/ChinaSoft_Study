package class0811;
/**
 * ArrayList是非线程 安全的，但是Vector是同步的，
 * Vector是使用数组实现的线程安全的列表。
 * Vector进行默认规则扩容时，新长度=原始长度*2
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>() ;
        Student stu1 = null ;
        Student stu2 = new Student() ;
        Student stu3 = new Student() ;
        Student stu4 = new Student() ;
        Student stu5 = new Student() ;
        list.add(stu1) ;
        list.add(stu2) ;
        list.add(stu3) ;
        list.add(stu4) ;
        list.add(stu5) ;
//        list.remove(11f) ;
        System.out.println("长度:" + list.size());
        //第二种遍历方式
        //锁定泛型后  就可以使用foreach循环了！！Drink this big aunt
        for (Student fl :
                list) {
            if (fl != null)
            System.out.println(fl.getAge());
            else System.out.println("没有这个学生！");
        }
        System.out.println("============");
        //第三种遍历方式，使用迭代器  很重要！
        Iterator it = list.iterator() ;
        while(it.hasNext()){
            Student stu = (Student) it.next() ;
            if (stu != null) System.out.println(stu.getAge());
            else System.out.println("此学生不存在");
        }
    }
}
