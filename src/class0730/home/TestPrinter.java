package class0730.home;

public class TestPrinter {
    public static void main(String[] args) {
        Printer p1 = new PrinterImpl() ; //左边接口，右边实现类！
        System.out.println("打印的第一个对象：");
        p1.print2();  //调用default 默认方法
        p1.A4();
        p1.black();
        p1.print();

        System.out.println();

        System.out.println("打印的第二个对象：");
        Printer p2 = new PrinterImpl() ;
        p2.print2();
        p2.B5();
        p2.chromatic();
        p2.print();


    }
}
