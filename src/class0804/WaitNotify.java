package class0804;

public class WaitNotify {
    //定义一个标识，表示是否有鸡蛋
    boolean flag = true ;
    //定义一个object对象，为了表示取蛋的人与鸡是同步操作同一个对象
    Object obj = new Object() ;
    //定义一个线程表示取蛋的人
    Thread man = new Thread(
            ()->{
                while(true){
                    if (flag){
                        System.out.println("鸡蛋已经吃了");
                        flag = false ;
                    }else {
                        System.out.println("我在等鸡蛋");
                        synchronized (obj){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
    ) ;
    Thread hen = new Thread(
            ()->{
                while (true){
                    if (!flag){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("下蛋完成，来收获");
                        flag = true ;
                        //唤醒取鸡蛋的人
                        synchronized (obj){
                            obj.notify();
                        }
                    }
                }
            }
    ) ;

    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify() ;
        wn.hen.start();
        wn.man.start();
    }
}
