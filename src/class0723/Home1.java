package class0723;

import java.util.Scanner;

//判断是否为闰年
public class Home1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0 ;
        while (true){
            if (input.hasNextInt()){
                year = input.nextInt();
                break;
            }else {
                System.out.println("请输入数字年份！");
                input = new Scanner(System.in);
            }
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year +"为闰年");
        }else{
            System.out.println(year + "为平年");
        }
    }
}
