package class0803;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        //数组扩容的算法
        int[] score = {20 , 30 } ;
        int[] score2  = new int[score.length * 2];
        for (int i = 0; i < score.length; i++) {
            score2[i] = score[i] ;
        }
        score2[2] = 9 ;
        System.out.println("score2:" + Arrays.toString(score2));
        Object obj = new Object() ;
//        obj = "hello" ; //向上转型！
        if (obj instanceof String){
            String str = (String) obj ;//向下转型！
        }
        System.out.println(obj);
    }
}
