package class0803;
//接口的方式
public class SecondThread implements Runnable { //实现Runnable接口
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "第二个线程执行" + Thread.currentThread().getName());
            //Thread.currentThread().getName() 使用线程的名字！
        }
    }
}
