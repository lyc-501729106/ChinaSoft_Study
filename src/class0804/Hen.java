package class0804;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Hen {
    //定义一个标识用来表示是否有鸡蛋
    public boolean flag = false ;
    //定义一个线程对象，用来表示人
    Thread man = new Thread(()->{
        while(true){
            //表示有鸡蛋
            if (flag){
                System.out.println("有鸡蛋！");
                flag = false ;
            }else{
                //没有鸡蛋的时候
                System.out.println("快下蛋");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }) ;
    //鸡
    Thread hen = new Thread(()->{
        while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true ;
        }
    });

    public static void main(String[] args) {
        Hen hen = new Hen() ;
        hen.man.start();
        hen.hen.start();
    }
}
