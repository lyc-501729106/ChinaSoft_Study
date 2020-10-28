package class0731;

/**
 * 静态内部类测试！！
 */
public class OuterClass3 {
    public static String name ;
    public int age ;
    public static class InnerClass{  //静态不可以修饰类，但是可以修饰内部类！
        //静态内部类可以定义静态属性！
        public static String ok ;
        public void test(){
            name = "lisi" ; // 静态内部类只能引用静态属性
            System.out.println(name);
        }
    }
    public void show(){
//        new InnerClass().test();
        new OuterClass3.InnerClass().test();
    }


    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3() ;
        outerClass3.show();
    }
}
