package class0728;

import java.util.Objects;

public class Test {
    private int age ;
    private String name ;

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
        return "Test{" +
                "name=" + name +' ' +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return age == test.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public static void main(String[] args) {
        Test t = new Test() ;
        t.setName("admin");

        t.setAge(6);
        System.out.println();
        System.out.println(t.toString());

    }
}
