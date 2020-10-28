package class1026;

/**
 * @author 吕译辰
 * @date 2020/10/26 - 10:25
 */
public class Dog {
    private String name;
    private int age;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("先name后age");
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("先age后name");
    }
    public void first(){
        System.out.println("初始化方法");
    }
    public void second(){
        System.out.println("销毁方法");
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
