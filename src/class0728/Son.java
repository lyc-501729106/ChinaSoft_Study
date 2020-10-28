package class0728;

public class Son  extends Father{
    public void test2(){
        super.test();//调用父类的方法
        this.show();//调用子类的方法
        show();  //等价于上一句
    }

    public Son(){
        super(); //调用父类对象的构造方法
        System.out.println("儿子");
    }
    public Son(String name){
        this(); // 调用当前对象的构造方法
    }
    public void show(){
        super.name = "张三" ;  //调用父类属性
        System.out.println("父类：" + super.name);
        this.name = "李四" ;    // 调用本类属性
        System.out.println("子类：" + this.name);
    }
}
