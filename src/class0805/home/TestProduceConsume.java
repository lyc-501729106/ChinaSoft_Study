package class0805.home;

import java.security.PublicKey;

class Clerk{//店员
    int product ;
    public synchronized void addProduct(){
        if (product >= 20){
            System.out.println("生产者稍微停一下");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            product++ ;
            System.out.println(Thread.currentThread().getName() + "生产了第:" + product + "个产品");
            notify();
        }

    }
    public synchronized void consumeProduct(){
        if (product <= 0){
            System.out.println("没有货了，等一会再来！");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(Thread.currentThread().getName() + "消费了第：" + product + "个产品");
            product-- ;
            notify();
        }

    }

}
class Producer implements Runnable{//生产者
    Clerk clerk ;
    public Producer(Clerk clerk){
        this.clerk = clerk ;
    }
    @Override
    public void run() {
        System.out.println("生产者开始生产商品");
        while (true){
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();  //一直生产
        }
    }
}
class Consumer implements Runnable{//消费者
    Clerk clerk ;
    public Consumer(Clerk clerk){
        this.clerk = clerk ;
    }
    @Override
    public void run() {
        System.out.println("消费者开始消费商品");
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct(); //一直消费
        }
    }

}
public class TestProduceConsume {
    public static void main(String[] args) {
        Clerk clerk = new Clerk() ;
        Producer producer = new Producer(clerk) ;
        Consumer consumer = new Consumer(clerk) ;
        Thread thread1 = new Thread(producer) ;
        Thread thread2 = new Thread(consumer) ;
        thread1.setName("tom");
        thread2.setName("jack");
        thread1.start();
        thread2.start();
    }
}
