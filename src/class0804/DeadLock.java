package class0804;
//死锁测试！
public class DeadLock {
     static Object obj1 = new Object() ;
     static Object obj2 = new Object() ;
    class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (obj1){
                try {
                    Thread.sleep(1);//获取obj1后先等一会儿，让Thread2有足够的时间锁住obj2
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是线程1，已经锁上了obj1");
                synchronized (obj2){
                    System.out.println("我是线程1，已经锁上了obj2");
                }
            }
        }
    }
    class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (obj2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是线程2，已经锁上了obj2");
                synchronized(obj1){
                    System.out.println("我是线程2，已经锁上了obj1");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock() ;
        dl.new Thread1().start();
        dl.new Thread2().start();
    }
}
