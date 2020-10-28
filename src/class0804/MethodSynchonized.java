package class0804;

import java.util.concurrent.TimeUnit;

public class MethodSynchonized {
    public static void main(String[] args) {
        //创建任务对象
        MethodSynchonized ms = new MethodSynchonized() ;
        //使用Lamda表达式就可以不再创建类实现接口等等操作，直接创建线程对象执行任务即可。
        new Thread(() -> ms.test1()).start();
        new Thread(() -> ms.test2()).start();
        new Thread(() -> ms.test3()).start();
    }
    public  synchronized void test1(){
        System.out.println("我是test1在执行任务！");
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(2); //TimeUnit是一个单位。这句表示以秒为单位！
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test1执行:" + i);
        }
    }
    public synchronized void test2(){
        System.out.println("我是test2在执行任务！");
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test2执行:" + i);
        }
    }
    public synchronized void test3(){
        System.out.println("我是test3在执行任务！");
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test3执行:" + i);
        }
    }
}
