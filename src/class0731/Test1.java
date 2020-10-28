package class0731;

public class Test1 {
    @FunctionalInterface
    public interface Math{
        public int start (int a , int b ) ;
    }
    public int show1(int a, int b , Math m){
        return m.start( a , b) ;
    }

    public static void main(String[] args) {
        Test1 t = new Test1() ;
        Math jia = (int a ,int b ) -> a + b ;
        System.out.println(t.show1(20 ,30 , jia));
    }
}
