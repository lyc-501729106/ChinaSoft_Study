package class0723;

import java.util.Scanner;

//3、	使用switch中的字符表达式 (char类型)来完成成绩为A，B，C，D，E情况下的奖惩制度。
public class Home2 {
    public static void main(String[] args) {
        System.out.print("请输入成绩等级:");
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        switch (a){
            case 'A' :
                System.out.println("A级，奖励笔记本");
                break;
            case 'B' :
                System.out.println("B级，奖励铅笔盒");
                break;
            case 'C' :
                System.out.println("C级，奖励圆珠笔");
                break;
            case 'D' :
                System.out.println("D级，奖励**");
                break;
            case 'E' :
                System.out.println("E级，奖励**");
                break;
        }
    }
}
