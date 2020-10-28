package class0803.home;

import static java.lang.Thread.sleep;

public class RunTest {
    public static void main(String[] args) {
        Tortoise t = new Tortoise() ;
        Rabbit r = new Rabbit() ;
        Thread thread = new Thread(r) ;

//        thread.setPriority(10);
//        t.setPriority(1); //设置优先级

        t.start();
        thread.start();

    }
}
class Tortoise extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("龟");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("龟已到终点");
    }
}
class Rabbit implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1500) ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子");
        }
        System.out.println("兔子已到终点");

    }
}
