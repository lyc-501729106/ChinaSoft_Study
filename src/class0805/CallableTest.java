package class0805;

import java.util.concurrent.*;

/**
 * newCachedThreadPool -> 创建一个可缓存的线程池
 * newFixedThreadPool -> 创建一个指定工作线程数量的线程池
 * newSingleThreadExecutor -> 创建一个单线程化的Executor
 * newScheduleThreadPool -> 创建一个定长的线程池
 * newSingleThreadScheduledExecutor -> 创建一个单线程执行程序
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个线程池
        ExecutorService es = Executors.newSingleThreadExecutor() ;
        //执行Runnab任务
        Future f = es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("我在使用Runnable执行任务");
            }
        }) ;
        System.out.println("runnable:" + f.get());
        f = es.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("我在使用Callable执行任务");
                return "测试成功了";
            }
        }) ;
        System.out.println("callable" + f.get());
        es.shutdown();
    }
}
