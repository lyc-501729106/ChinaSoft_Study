package class0723;

import java.util.Scanner;

public class JudgeNo {
    public static int judge(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字：");
        int no = 0 ;
        while (true){
            if(input.hasNextInt()){
                no = input.nextInt();
                break;
            }else {
                System.out.print("请输入数字！");
                input = new Scanner(System.in);
            }
        }
        return no;
    }
}
