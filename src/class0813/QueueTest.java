package class0813;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *  final ReentrantLock lock ; -> ReentrantLock为一种锁
 *  queue.add() ;  //向队列添加一个元素
 *  queue.offer() ; //向队列添加一个元素
 *  queue.remove() ;//如果为空则抛出异常
 *  queue.poll() ; //查看头部后删除这个元素,如果为空则返回null
 *  queue.peek() ; //查看头部后不删除这个元素
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new ArrayBlockingQueue(5) ;
        queue.add(6) ;
        queue.add(5) ;
        queue.offer(4) ;
        queue.add(3) ;
        queue.add(2) ;

        System.out.println(queue.offer(1) );
        while(queue.size() > 0){
            System.out.println(queue.remove() + " -");
        }
//        System.out.println(queue.poll()); //查看后删除
//        System.out.println(queue.peek()); //查看队头后不删除

    }
}
