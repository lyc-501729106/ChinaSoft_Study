package class0724.home;

import java.util.Scanner;

public class SuShu {
    public static void main(String[] args) {
        System.out.print("请输入你要判断的数字：");
        int num = judge() ;
        int a = 0 ;
        if (num == 0 ){
            System.out.println("不是素数:" + num);
        }
        if (num == 1 ){
            System.out.println("不是素数:" + num);
        }
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                a++;
            }
            if(a==0){
                System.out.println("素数:" + num);
                break;
            } else {
                System.out.println("不是素数:" + num);
                break;
            }
        }



    }

    public static int judge(){
        Scanner input = new Scanner(System.in);
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
