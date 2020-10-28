package class0723;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        System.out.print("输入成绩：");
        int a = new Scanner(System.in).nextInt();
        if (a < 60 && a > 0){
            System.out.println("不及格");
        }else if (a >= 60 && a < 90){
            System.out.println("强");
        }else if (a >= 90 && a < 100){
            System.out.println("优秀");
        }else if (a == 100){
            System.out.println("满分");
        }else {
            System.out.println("输入的成绩不合理");
        }
    }
}
