package class0818;

import java.io.Serializable;

/**
 * 加上transient 就无法传输了
 */
public class Student implements Serializable {
    private transient int age ; //
    private String name ;

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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
