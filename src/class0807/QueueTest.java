package class0807;

public class QueueTest {
    //定义一个数组
    int[] queue ;
    //定义数组的长度
    int SIZE ;
    //定义头
    int head ;
    //定义队尾
    int end ;
    //定义构造方法
    public QueueTest(){
        queue = new int[100] ;
        SIZE = 100 ;
        head = 0 ;
        end = 0 ;
    }
    public QueueTest(int size){
        queue = new int[size] ;
        SIZE = size ;
        head = 0 ;
        end = 0 ;
    }
    //因为我们现在使用的是循环队列，所以数组的下一个位置并不是++,而是需要经过运算得出下标地址
    public int next(int index){
        return (index + 1 ) % SIZE ;
    }
    //判断队满
    public boolean isFull(){
        return next(end) == head ;
    }
    //判断队空
    public boolean isNull(){
        return head == end ;
    }
    //进队
    public synchronized void offer(int data){
        //判断是否队满
        if (isFull()){
            throw new IllegalStateException("队满了，不能再添加了") ;
        }else {
            queue[end] = data ;
            end = next(end) ;
        }
    }
    //进队
    public int peek(){
        int data = 0 ;
        if (isNull()){
            throw new IllegalStateException("队空了，啥也掏不出来啊") ;
        }else{
            data = queue[head] ;
            head = next(head) ;
        }
        return data ;
    }
}
