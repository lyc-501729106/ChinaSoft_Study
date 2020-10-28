package class0723;


import java.util.Scanner;

public class ShuiXianHua {
    public static void main(String[] args) {
        int j,k,n;
        System.out.print("请输入数字：");
        int a= new Scanner(System.in).nextInt();
        for (int i = 1;i<a;i++){
            j = i%10;//取个位
            k = i/10%10;//取十位
            n = i/100;//取百位
            if(j*j*j+k*k*k+n*n*n == i){
                System.out.println("水仙花数："+i);
            }
            //(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)
//            System.out.println(j*j*j+k*k*k+n*n*n == i?i:"");

        }
//        int i=407;
//        int j,k,n;
//            j=i%10;//取个位
//            k=i/10%10;//取十位
//            n=i/100;//取百位
//        System.out.println("个位"+j);
//        System.out.println("十位"+k);
//        System.out.println("百位"+n);

    }

}


