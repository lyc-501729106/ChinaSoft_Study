package class0723;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        int password = 123;
        int j = 1;
        Scanner input = new Scanner(System.in);
        while (j <= 3 ){
            System.out.print("输入密码:");
            int a = 0;
            /**知识重难点
             * 判断是不是数字
             * */
            while (true){
                if (input.hasNextInt()){
                    a = input.nextInt();
                    break;
                }else {
                    System.out.println("请输入数字！");
                    input = new Scanner(System.in);
                }
            }

            j++;
            if (password == a){
                System.out.println("输入正确！");
                break;
            }else {
                int b = 4 - j;
                System.out.println("还有" +b+ "次机会");
                if (j == 4){
                    System.out.println("已经错误了3次，自动退出");
                    break;
                }
            }
        }
    }
}
