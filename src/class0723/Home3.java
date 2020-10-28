package class0723;

import java.util.Scanner;

//3、	使用if-else嵌套修改用switch完成的成绩优良中差。。
public class Home3 {
    public static void main(String[] args) {
        System.out.print("请输入成绩：");
        Scanner input = new Scanner(System.in);
        int a =0 ;

        while (true){
            if (input.hasNextInt()){
                a = input.nextInt();
                break;
            }else {
                System.out.print("请输入数字：");
                input = new Scanner(System.in);
            }
        }

        if (a >= 0 && a < 60){
            System.out.println("不及格");
        }else if (a >= 60 && a <= 80){
            System.out.println("良好");
        }else if (a >= 80 && a <100){
            System.out.println("优秀");
        }else {
            System.out.println("满分");
        }
    }
}
