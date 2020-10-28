package class0804;

import java.util.concurrent.TimeUnit;

public class ThisSynchonized {
    public  void test1(){
        System.out.println("我是test1在执行任务！");
        synchronized (this) {  //锁对象
            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.SECONDS.sleep(2); //TimeUnit是一个单位。这句表示以秒为单位！
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("test1执行:" + i);
            }
        }
    }
    public  void test2(){
        System.out.println("我是test2在执行任务！");
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("test2执行:" + i);
            }
        }

    }
    public  void test3(){
        System.out.println("我是test3在执行任务！");
        synchronized (this) {
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

    public static void main(String[] args) {
        ThisSynchonized ts = new ThisSynchonized() ;
        new Thread(()->ts.test1()).start();
        new Thread(()->ts.test2()).start();
        new Thread(()->ts.test3()).start();
    }
}
