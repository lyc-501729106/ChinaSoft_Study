package class0814;

import java.util.Comparator;

/**
 * 使用内部比较器来排序
 */
public class Student implements Comparable<Student> {
    private String name ;
    private int age ;
    public Student(){}
    public Student(String name , int age ){
        this.name = name ;
        this.age = age ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*对age进行排序*/
    @Override
    public int compareTo(Student o) {
        if (this != null && o != null){
            if (this.getAge() > o.getAge())
                return 1 ;
        }else {
            new RuntimeException("对象不能为空!!") ;
        }
        return 0;
    }
    /*对name进行排序*/
    /*@Override
    public int compareTo(Student o) {
        if (this != null && o != null){
            if (this.getName().compareTo(o.getName()) > 0) {
                return 1 ;
            }else if (this.getName().compareTo(o.getName()) < 0){
                return -1 ;
            }

        }else {
            new RuntimeException("对象不能为空!!") ;
        }
        return 0;
    }*/


}
