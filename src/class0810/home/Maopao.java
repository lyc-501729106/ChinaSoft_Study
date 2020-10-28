package class0810.home;

public class Maopao {
    public void sort(){
        int[] a ={11 ,62, 65 , 98 ,5 ,64 ,9 ,75} ;
        int temp ;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-1; i++) { //交换位置
                if (a[i] > a[i+1]){
                    temp = a[i] ;
                    a[i] = a[i+1] ;
                    a[i+1] = temp ;
                }
            }
        }
        for (int aa :
                a) {
            System.out.print(" " + aa);
        }
    }
    public static void main(String[] args) {
        Maopao m = new Maopao() ;
        m.sort();
    }
}
