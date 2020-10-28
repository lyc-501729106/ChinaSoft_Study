package class0803;
//启动线程
public class TestThread {
    public static void main(String[] args) {
        //创建Thread对象
        //第一种方式创建的类本身就是Thread对象，所以直接创建实例即可
        FirstThread ft = new FirstThread() ;
        ft.setPriority(1); // 设置优先级
        ft.start();
        //第二种方式因为实现了Runnable接口，所以它本身并不是一个Thread对象，所以我们需要转换为Thread对象才能够调用start方法
        SecondThread st = new SecondThread() ;
        Thread second = new Thread(st,"second") ;//给线程起名字！
        second.setPriority(10); //设置优先级 10最高
        second.start();
    }
}
