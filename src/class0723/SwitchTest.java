package class0723;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.print("input:");
//        int a = new Scanner(System.in).nextInt();
//        if (a < 0 || a > 100){
//            System.out.println("输入的成绩不合理");
//        }else {
//
//        }

        Week week = Week.星期一;
        switch (week){
            case 星期一 :
                System.out.println("周一了");
                break;
            case 星期二 :
                System.out.println("周二了");
                break;
            case 星期三 :
                System.out.println("周三了");
                break;
//            case 9 :
//                System.out.println("90+");
//                break;
//            case 10 :
//                System.out.println("满分");
//                break;
            default :
                System.out.println("不及格");
        }
    }
}
