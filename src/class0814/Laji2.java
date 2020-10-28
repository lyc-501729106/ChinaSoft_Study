package class0814;

/**
 * 垃圾回收的内存泄露情况；
 */
public class Laji2 {
    static Laji1 l1 ;

    public static void main(String[] args) {
        Laji2 l1 = new Laji2() ;
        Laji1.l2 = l1 ;
        l1 =Laji1.l2 ;
        //以上可以看出，两个对象彼此指向对方而没有被其他任务对象引用，所以会产生内存泄露的现象

    }
}
