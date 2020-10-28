package class0728.home;
//斐波那契数列
public class FeiBo {
    public int no(int n ){
        if ( n == 1 || n == 2) return 1 ;
        return no(n - 1 ) + no( n - 2 ) ;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(new FeiBo().no(i) + " ");
        }

    }
}
