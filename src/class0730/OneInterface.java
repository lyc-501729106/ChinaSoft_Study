package class0730;
//接口可以继承接口
public interface OneInterface extends FatherInterface ,TwoInterface{
    public void show1() ;//约定！
    default void test(){ //default 关键字可以写默认方法！！
        System.out.println("我是JDK8以后的方法！");
    }
    default void test2(){
        System.out.println("第二个方法");
    }
}
