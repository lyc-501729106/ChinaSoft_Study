package class0805;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutor {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService es = Executors.newSingleThreadExecutor() ;
        es.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("坚持住啊， 别睡着了，虽然我很困！");
            }
        });
        es.shutdown();
    }

}
