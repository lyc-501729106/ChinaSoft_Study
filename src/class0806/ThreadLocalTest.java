package class0806;
//这个面试必问！！！！    ThreadLocal用来解决多线程程序的并发问题
public class ThreadLocalTest {
    //定义两个ThreadLocal变量
    ThreadLocal<String> threadLocal = new ThreadLocal<>() ;
    ThreadLocal<Long> threadLoca2 = new ThreadLocal<Long>() ;
    //定义一个set方法,用来给两个变量赋值
    public void set(){
        threadLocal.set(Thread.currentThread().getName());
        threadLoca2.set(Thread.currentThread().getId());
    }
    //创建到threadLocal1变量的值
    public String get1(){
        return threadLocal.get() ;
    }
    //获取到threadLocal2变量的值
    public Long get2(){
        return threadLoca2.get() ;
    }

    public static void main(String[] args) throws InterruptedException {
        //创建当前对象
        ThreadLocalTest threadLocalTest = new ThreadLocalTest() ;
        //调用set 方法给本地变量赋值
        threadLocalTest.set();
        //显示两个本地变量的值
        System.out.println("初始本地变量1的值" + threadLocalTest.get1());
        System.out.println("初始本地变量2的值" + threadLocalTest.get2());
        Thread thread = new Thread(){
            @Override
            public void run() {
                //新线程给两个本地变量赋值
                threadLocalTest.set();
                System.out.println("修改后本地变量1的值" + threadLocalTest.get1());
                System.out.println("修改后本地变量2的值" + threadLocalTest.get2());
            }
        } ;
        thread.start();
        thread.join(); //抢
        System.out.println("回到主线程本地变量1的值" + threadLocalTest.get1());
        System.out.println("回到主线程本地变量2的值" + threadLocalTest.get2());//从线程的角度看，目标变量就象是线程的本地变量，这也是类名中“Local”所要表达的意思
    }
}
