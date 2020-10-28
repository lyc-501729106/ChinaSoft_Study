package class0722;

public class homework1 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        if (a++ > 0 || b++ > 0){ //前一个语句满足后，不再执行下一个语句
            System.out.println("进去了");
        }
        System.out.println(a);
        System.out.println(b);
    }
}
