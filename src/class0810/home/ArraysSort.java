package class0810.home;

public class ArraysSort {
    public void sort(String string){
        String [] str = new String[15] ;
        str[0] = "A" ;
        str[2] = "D" ;
        str[4] = "M" ;
        str[6] = "Q" ;
        str[8] = "X" ;
        str[10] = "Z" ;

        for (int i = 0; i < str.length; i++) {
            if (str[i] != null) {
                if (string.compareToIgnoreCase(str[i]) < 0 ){
                    System.out.println(string.compareToIgnoreCase(str[i])); // compareToIgnoreCase忽略大小写比较
                    str[i-1] = string ;
                    break ;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i] != null) {
                System.out.print(" " + str[i]);
            }
        }
    }
    public static void main(String[] args) {
        ArraysSort as = new ArraysSort() ;
        as.sort("b"); //B的ASCII为66 D的ASCII为68

    }
}
