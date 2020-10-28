package class0730;

public abstract class Animal {
    public Animal (){
        System.out.println("这是通过匿名内部类来调用的");
    }
    String name ;
    int age ;
    public abstract void eat() ; //约定
    public void test(){
        System.out.println("我是父类的测试");
    }

}
