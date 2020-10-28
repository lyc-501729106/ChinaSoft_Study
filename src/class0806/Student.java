package class0806;

public class Student {
    private String name ;
    private int age ;
    public String address ;
    public void show(){
        System.out.println("测试一下反射技术");
    }
     Student(){
        System.out.println("我是无参的构造方法");
    }
    public Student(String name , int age){
        this.name = name ;
        this.age = age ;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
