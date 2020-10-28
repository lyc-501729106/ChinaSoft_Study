package class0810.home;

public class Charu {
    public void sort(int num){
        int[] a = new int[10] ;
        a[0] = 0 ;
        a[1] = 10 ;
        a[2] = 20 ;
        a[3] = 30 ;
        a[4] = 40 ;
        a[5] = 50 ;
        a[6] = 60 ;
        a[7] = 70 ;
        a[8] = 80 ;
        for (int i = 0; i < a.length; i++) {
            if (num < a[i]){
                for (int j = 8; j >= i; j--) {  //往后挪 腾空位置
                    a[j+1] = a[j] ;
                }
                a[i] = num ;
                break;
            }
        }

        for (int bb :
                a) {
            System.out.print(" " + bb);
        }

    }
    public static void main(String[] args) {
        Charu c = new Charu() ;
        c.sort(7);
    }
}
