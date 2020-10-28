package class0804.home;
//火车站卖票系统，使用runnable接口创建

public class Ticket implements Runnable {
    static int ticket = 20;
    @Override
    public void run() {
        if (ticket > 0) {
            while (ticket > 0) {
                //当还有票的时候，要用同步锁，一个线程在抢票的时候，其他的线程不能访问
                this.sale();
                //每卖一次票就要给其他线程机会
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("所有车票已经售空");
        }else {
            System.out.println("所有车票已经售空");
        }
    }

     synchronized void sale() {
        this.ticket= --ticket ;
        System.out.println(Thread.currentThread().getName() + "购买到一张火车票   " + "目前剩余" +ticket);
    }

    public static void main(String[] args) {
        Ticket buy = new Ticket();
        Thread th1 = new Thread(buy, "jack");
        Thread th2 = new Thread(buy, "tom");
        th1.start();
        th2.start();

    }
}

