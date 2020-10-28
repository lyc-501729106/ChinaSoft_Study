package class0727;

public class Person {
    //身高属性
    public double height ;
    //体重属性
    public double weigt ;
    public  Person(){
        System.out.println("我是无参构造方法");
    }
   public Person(double h , double w){
        this.height = h ;
        this.weigt = w ;
   }

    public void study(){
        System.out.println("我们是超级爱学习的，周末绝对不会出去玩儿的！！！！");
    }

}
