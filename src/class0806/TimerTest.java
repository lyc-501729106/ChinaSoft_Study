package class0806;

import java.util.Timer;
import java.util.TimerTask;

//创建一个任务内部类
class MyTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("我是来执行任务的...");
    }
}
public class TimerTest {
    public static void main(String[] args) {
        //创建一个Timer对象
        Timer timer = new Timer() ;
        //调用执行任务的方法
        timer.schedule(new MyTask() , 1000 , 2000);
        //每两秒执行一次,一秒后开始
    }
}
