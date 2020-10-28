package class0724.home;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int [][] a = new int[2][3] ;

        System.out.println();
        int b = 1 ;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("请输入第" + b++ + "的成绩:");
                a [i][j]  = input.nextInt();
            }
        }

            int c = 1 ;
        for (int i = 0; i < a.length; i++) {
            System.out.print("第" + c++ +"个班级:");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
