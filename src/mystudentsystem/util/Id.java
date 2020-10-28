package mystudentsystem.util;

import java.util.Random;

/**
 * String.valueOf(l); 会返回一个字符串。
 */
public class Id {
    public static void numId(){
        Random ran=new Random();
        int a=ran.nextInt(99999999);
        int b=ran.nextInt(99999999);
        long l=a*10000000L+b;
        System.out.println(l);
    }
}
