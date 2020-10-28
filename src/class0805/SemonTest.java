package class0805;
//信号量也非常重要！！！
import java.util.concurrent.Semaphore;

public class SemonTest extends Thread{
    private Semaphore s;//定义信号量
    private  String name;//定义名字变量


    public SemonTest(){

    }
    public SemonTest(Semaphore s,String name){
        this.s = s;
        this.name = name;

    }
    @Override
    public void run() {
        //判断信号量是否还有
        if(s.availablePermits() > 0){
            System.out.println(name+"有位置.赶紧抢");
        }else{
            System.out.println(name+"没有位置");
        }
        try {
            s.acquire();//拿到许可证
            Thread.sleep(1000);
            System.out.println(name+"抢到了,可以吃啦");
            s.release();//释放许可证
            System.out.println(name + "吃完了 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //创建信号量对象
        Semaphore ss = new Semaphore(2);//参数规定好信号量数量
        //创建对象执行任务
        new SemonTest(ss,"jack").start();
        new SemonTest(ss,"tom").start();
        new SemonTest(ss,"lucy").start();
    }


}
