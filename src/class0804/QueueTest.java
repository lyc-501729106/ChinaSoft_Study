package class0804;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueTest {
    public static void main(String[] args) {
        //定义一个非阻塞队列
        ConcurrentLinkedDeque<Integer> que = new ConcurrentLinkedDeque<>() ;
        //向队列中添加元素 队列先进先出！
        que.add(1) ;
        que.add(2) ;
        que.addFirst(3); //将3放到队首！
        //出队列
//        System.out.println(que.peek());  //只查询，不删除
        System.out.println(que.poll());   //查询之后删除
        System.out.println(que.poll());
        System.out.println(que.poll());

        //定义一个阻塞队列
        BlockingDeque<String> bd = new LinkedBlockingDeque<>(2) ;
        bd.add("hello") ;
        bd.add("world") ;
//        System.out.println(bd.peek());
        System.out.println(bd.poll());
        System.out.println(bd.poll());
        System.out.println(bd.poll());

    }
}
