package class0730.home;

public interface Printer extends Paper , Color{
    public void print() ;
    default void print2(){
        System.out.println("正在打印中...");
    }

}
