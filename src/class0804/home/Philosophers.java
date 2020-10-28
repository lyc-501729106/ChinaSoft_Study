package class0804.home;

public class Philosophers {
    //5支筷子
    static Object obj1 = new Object() ;
    static Object obj2 = new Object() ;
    static Object obj3 = new Object() ;
    static Object obj4 = new Object() ;
    static Object obj5 = new Object() ;
    static class a implements Runnable{
        @Override
        public void run() {
            synchronized (obj1){
                System.out.println("我是哲学家1，我拿到一只筷子");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj5){
                    System.out.println("我是哲学家1，用餐完毕");
                }
            }
        }
    }
    static class b implements Runnable{

        @Override
        public void run() {
            synchronized (obj2){
                System.out.println("我是哲学家2，我拿到一只筷子");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1){
                    System.out.println("我是哲学家2，用餐完毕");
                }
            }
        }
    }
    static class c implements Runnable{

        @Override
        public void run() {
            synchronized (obj3){
                System.out.println("我是哲学家3，我拿到一只筷子");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2){
                    System.out.println("我是哲学家3，用餐完毕");
                }
            }
        }
    }
    static class d implements Runnable{

        @Override
        public void run() {
            synchronized (obj4){
                System.out.println("我是哲学家4，我拿到一只筷子");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj3){
                    System.out.println("我是哲学家4，用餐完毕");
                }
            }
        }
    }
    static class e implements Runnable{

        @Override
        public void run() {
            synchronized (obj5){
                System.out.println("我是哲学家5，我拿到一只筷子");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                synchronized (obj4){
//                    System.out.println("我是哲学家5，用餐完毕");
//                }
            }
        }
    }

    public static void main(String[] args) {
        a a = new a() ;
        b b = new b() ;
        c c = new c() ;
        d d = new d() ;
        e e = new e() ;
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        Thread thread3 = new Thread(c);
        Thread thread4 = new Thread(d);
        Thread thread5 = new Thread(e);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
