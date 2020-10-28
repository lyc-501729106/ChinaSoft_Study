package class0820;

public class TestSingle {
    //创建私有的构造方法
    private TestSingle(){
        System.out.println("Single-懒汉模式");
    }
    //定义一个静态属性。
    private static TestSingle testSingle ;
    //定义一个静态方法，用来获取当前类的实例
    public static synchronized TestSingle getInstance(){
        if (testSingle == null){
            testSingle = new TestSingle() ;
        }
        return testSingle ;
    }

}
