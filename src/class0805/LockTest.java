package class0805;
//使用锁
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    Lock lock1 = new ReentrantLock() ; //创建一个ReentrantLock实例
    public void test(){
        synchronized (this){
            System.out.println("我被锁上了，我在使用同步");
        }
    }
    public void show(){
        //上锁 锁的是对象，而不是方法！
        lock1.lock();
        System.out.println("我在使用锁");
        //解锁
        lock1.unlock();
    }

    public static void main(String[] args) {
        LockTest lockTest = new LockTest() ;
        lockTest.test();
        lockTest.show();
    }
}
