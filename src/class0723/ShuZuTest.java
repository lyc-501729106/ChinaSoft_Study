package class0723;

import java.util.Scanner;

public class ShuZuTest {
    public static void main(String[] args) {
        int score [] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("请输入：");
        int a = 0;
        //效验是否为数字！
        while (true){
            if (input.hasNextInt()){
                a = input.nextInt();
                break;
            }else {
                System.out.println("请输入数字");
                input = new Scanner(System.in);
            }
        }
        score[0] = a;
        System.out.println(score[0]);
        System.out.println("地址为：" + score);
//        for (int i = 0; i < 11; i++) {
//            System.out.println(score[0]);
//        }
    }
}
