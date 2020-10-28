package class0805.home;

import com.sun.xml.internal.ws.message.stream.StreamHeader;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTicket implements Runnable{
    static int ticket = 10 ;
    Lock lock1 = new ReentrantLock() ;//用Lock
    @Override
    public void run() {
        while (true){
            if (ticket == 0) {
                System.out.println("票已售空！");
                break;
            }
            lock1.lock(); //上锁
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":我抢到票了！");
                ticket-- ;
                System.out.println("票还剩:" + ticket );
                lock1.unlock(); //解锁
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        LockTicket lt = new LockTicket() ;
        Thread thread1 = new Thread(lt,"jack") ;
        Thread thread2 = new Thread(lt,"tom") ;
        thread1.start();
        thread2.start();
    }
}
