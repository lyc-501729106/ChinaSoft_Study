package class0730;

public class TestStatic {
    public static String name ;//static 可以用来修饰属性，但不可以修饰类！
    public String oldnae ;
    public static int classScore ;//静态方法只能使用静态变量，所以要加static
    public int sigleScore ;
    public static void good(){//用static修饰的方法与对象无关，与类无关。(类名.方法名)
        classScore += 10 ;
    }
    public void bad(){
        sigleScore -= 20 ;
    }
    static {
        System.out.println("我是静态块！！");//只执行一次，不管你创建几个对象！
    }
    public TestStatic(){
        System.out.println("我是构造方法！");//创建几个对象，调用几次！
    }
    {
        System.out.println("我是普通块！");//创建几个对象，调用几次！
    }

    public static void main(String[] args) {
        TestStatic ts1 = new TestStatic() ;
        ts1.name = "A" ;
        ts1.oldnae = "a" ;
        TestStatic ts2 = new TestStatic() ;
        ts2.name = "B" ;
        ts2.oldnae = "b" ;
        System.out.println("第一个对象名字：" + ts1.name + "    ts1的oldname名字为：" + ts1.oldnae);
        System.out.println("第二个对象名字：" + ts2.name + "    ts2的oldname名字为：" + ts2.oldnae);
        ts1.good();
        ts1.good();
        TestStatic.good();//静态方法可以直接使用"."来调用！！
        ts2.bad();
        System.out.println("ts1:" + ts1.classScore + " " + ts1.sigleScore);
        System.out.println("ts2:" + ts2.classScore + " " + ts2.sigleScore);

    }
}
