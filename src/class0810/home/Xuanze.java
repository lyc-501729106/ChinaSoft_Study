package class0810.home;

public class Xuanze {
    public void sort(){
        int[] a = {60,20,40,1,90,10 ,15} ;
        for (int i = 0; i < a.length - 1; i++) {
            int min = i ;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]){
                    min = j ;
                }
            }
            if (min != i){
                swap(a , i , min ) ;
            }
        }
        for (int aa :
                a) {
            System.out.print(" " + aa);
        }
    }
    public void swap(int [] a ,int aa , int b ){
        int temp = a[aa] ;
        a[aa] = a[b] ;
        a[b] = temp ;
    }

    public static void main(String[] args) {
        Xuanze x = new Xuanze() ;
        x.sort();
    }
}
