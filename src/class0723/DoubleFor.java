package class0723;

public class DoubleFor {
    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i +"="+ i*j + " ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) {  //i为行数！
            //打印空格
            for (int k = 0; k <= 5-i; k++) {
                System.out.print("1");
            }
            //内循环控制图案的数量
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            //外循环控制行数
            System.out.println();
        }
    }
}
