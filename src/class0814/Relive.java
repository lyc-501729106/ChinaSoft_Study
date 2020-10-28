package class0814;

/**
 * 可以重写，但是不建议！ finalize() ;
 */
public class Relive {
    public static Relive relive ;

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("我要满血复活");
        relive = this ;
        System.out.println("资源关闭");
    }

    public static void main(String[] args) throws InterruptedException {
        //创建对象
        Relive.relive = new Relive() ;
        System.out.println(Relive.relive);
        Relive.relive = null ;
        System.out.println(Relive.relive);
        //调用gc方法，试图垃圾回收
        System.gc();
        //给个回收的时间.
        Thread.sleep(2000);
        System.out.println(Relive.relive);
        Relive.relive = null ;
    }
}
