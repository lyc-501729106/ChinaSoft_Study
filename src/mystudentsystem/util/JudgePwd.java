package mystudentsystem.util;


import java.util.Scanner;

public class JudgePwd {
    public static String judgepwd(){
        Scanner input = new Scanner(System.in) ;
        String pwd = input.next() ;
        int j = 0 ;
        int num = 0 ;
        int small = 0 ;
        int big = 0 ;
        int countnum = 0 ;
        int countsmall = 0 ;
        int countbig = 0 ;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i) ;

            if (Character.isDigit(c)){
                num = 1 ;
                countnum++ ;
            }else if (Character.isLowerCase(c)){
                small = 1 ;
                countsmall++ ;
            }else if (Character.isUpperCase(c)){
                big = 1 ;
                countbig++ ;
            }
        }
        /*System.out.println("数字个数:" + countnum);
        System.out.println("小写个数:" + countsmall);
        System.out.println("大写个数:" + countbig);*/
        j = num + small + big ;
/**
 * System.out.println("    密码强度低！");
 * System.out.println("    密码强度中！");
 * System.out.println("    密码强度高！");
 */
        if (countnum >= 3 & countsmall >= 3 & countbig >= 3){
            System.out.println("    密码强度高！");
        }else if (countnum == 2 & countsmall == 2 & countbig == 2){
            System.out.println("    密码强度中！");
        }else if (countnum == 1 & countsmall == 1 & countbig == 1){
            System.out.println("    密码强度低！");
        }else {
            System.out.println("    密码强度低！");
        }

        if (j == 3) return pwd ; //数字，大小写都有时，返回密码！
        return null ;
    }

}
