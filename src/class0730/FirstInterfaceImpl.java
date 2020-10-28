package class0730;
//先写继承，再写实现接口，反之报错
public class FirstInterfaceImpl extends Animal implements FirstInterface , SecondInterface{

    @Override
    public void eat() {

    }

    @Override
    public void test() {
        System.out.println("我是干活的人");
    }

    @Override
    public void show2() {

    }
}
