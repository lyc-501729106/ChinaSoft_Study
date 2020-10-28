package class0807;

public class Student {
    private String name ;
    private int age ;
    public String address ;

    public int getScore(){
        return 0 ;
    }
    public void setBirthday(String name){}

    public void show(String name , int age ){
        System.out.println(name +"测试一下反射技术" + age );
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
