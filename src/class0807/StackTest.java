package class0807;

public class StackTest {
    private int[] stacks ;//定义一个数组
    private int SIZE ;//定义数组的长度
    private int top ;//定义栈顶
    private int bottom ;//定义栈底
    public StackTest(){//创建构造方法，初始化数组
        stacks = new int[100] ; //初始化数组
        SIZE = 100 ;//当前长度
        top = bottom ; //设置空栈
    }
    //创建一个有参的构造方法，用来指定栈的大小
    public StackTest(int size){
        stacks = new int[size] ;
        SIZE = size ;
        top = bottom ;
    }
    //判断是否栈满
    public boolean ifFull(){
        if (top == SIZE){
            return true ;
        }else{
            return false ;
        }
    }
    //完成进栈功能
    public synchronized void push(int value){
        //判断是否栈满
        if (ifFull()){
            throw new IllegalStateException("栈满了，不能再添加了") ;
        }else {
            //栈未满的时候，将value的值存入到数组中，即进栈
            stacks[top++] = value ;
        }
    }
    //判断栈空
    public boolean isNull(){
        return bottom == top ;
    }
    //完成出栈功能
    public synchronized int poll(){
        //判断是否栈空
        if (isNull()){
            throw new IllegalStateException("栈空了，没有任何数据可出");
        }else {
            return stacks[--top] ;
        }
    }

    public static void main(String[] args) {
        //创建栈对象
        StackTest stackTest = new StackTest() ;
        //进栈
        stackTest.push(11);
        stackTest.push(22);
        stackTest.push(33);
        System.out.println(stackTest.poll());
    }
}
