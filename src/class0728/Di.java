package class0728;
//递归
public class Di {
    public int getNo(int n){
        if (n == 1){
            return 1 ;
        }else {
            return getNo(n - 1) + n ;
        }
    }
    public int jiechen(int  n){
        int num = 1 ;
        int sum = 1 ;
        for (int i = 0; i < n; i++) {
             num = n - i ;
             sum = sum * num ;
        }
        return sum ;
    }

    public static void main(String[] args) {
        System.out.println(new Di().getNo(9));
        System.out.println(new Di().jiechen(3));
    }
}
