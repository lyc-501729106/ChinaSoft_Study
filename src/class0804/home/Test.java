package class0804.home;

public class Test implements Runnable {
    static int ticket = 10 ;
    @Override
    public void run() {
        if (ticket > 0) {
            while (ticket > 0){
                this.a();
                try {
                    Thread.sleep(100); //抢到票后，休眠100毫秒，给其它线程机会
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            System.out.println("票已经卖完了！");
        }else {
            System.out.println("票已经卖完了！");
        }
    }
    synchronized public void a(){ //加锁，一个线程访问时，其它线程不能访问！
        ticket-- ;
        if (ticket > 0)
        System.out.println("目前还剩" + ticket + "票  " + Thread.currentThread().getName() + "抢到了一张");
    }

    public static void main(String[] args) {
        Test t = new Test() ;
        Thread thread1 = new Thread(t,"jack") ;
        Thread thread2 = new Thread(t,"tom") ;
        Thread thread3 = new Thread(t,"lucy") ;
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
