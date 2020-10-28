package class0805;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class MyThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,2,1,
                TimeUnit.SECONDS , new LinkedBlockingDeque<Runnable>(2)) ;
        threadPoolExecutor.execute(new MyThread()) ;
        threadPoolExecutor.execute(new MyThread()) ;
        System.out.println(threadPoolExecutor.getPoolSize());
        threadPoolExecutor.execute(new MyThread()) ;
        threadPoolExecutor.execute(new MyThread()) ;
//        Thread.sleep(6000);
        System.out.println(threadPoolExecutor.getPoolSize());
        threadPoolExecutor.shutdown();
    }
}

