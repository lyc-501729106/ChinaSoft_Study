package class0814;

import java.util.*;

/**
 * 自然排序！
 */
public class ComparableTest {
    public static void main(String[] args) {
        Student[] stus = new Student[2] ;
        stus[0] = new Student("ac" , 11) ;
        stus[1] = new Student("ab" , 12) ;
        Arrays.sort(stus); //因为Student对象并没有任何可排序的操作，所以在进行排序的时候无法正常排序
        for (Student stu :
                stus) {
            System.out.println(stu.getAge());
        }
        List<Student> stulist = new ArrayList<>() ;
        stulist.add(new Student("ac" , 11)) ;
        stulist.add(new Student("sadf" , 654)) ;
        Collections.sort(stulist);
        for (Student stu :
                stulist) {
            System.out.print(stu.getName() + " ");
        }
        System.out.println();
        System.out.println("==外部构造器的使用==");
        Set<Student> student = new TreeSet<>(new StuNameComparator()) ;
        student.add(new Student("zhangsan" , 12)) ;
        student.add(new Student("lisi" , 23)) ;
        for (Student stu :
                student) {
            System.out.print(stu.getName() + " ");
        }
    }

}
