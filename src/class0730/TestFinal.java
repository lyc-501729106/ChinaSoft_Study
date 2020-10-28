package class0730;

public class TestFinal {
    final int A = 4 ;
    public void test(){
        final char sex ='男';
        System.out.println(sex);
    }
    public final void show(){
        System.out.println("这是final修饰的。");
    }
    public static void main(String[] args) {
        TestFinal tf = new TestFinal() ;
        System.out.println("这是常量：" + tf.A);
        tf.test();
        Test2 t = new Test2() ;
        t.testfinal();
    }
}
class  Test2 extends TestFinal{
    public void testfinal(){
        show(); //final修饰的，可以继承 ，不可以重写。。。

    }

}
