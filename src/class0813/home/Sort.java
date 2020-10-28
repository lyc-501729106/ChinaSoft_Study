package class0813.home;

import java.util.ArrayList;

public class Sort {
    public void sort1(){
        int array[] = {1,2,6,4,5,9,7} ;
        for (int arr :
                array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        for (int j = 0 ; j < array.length ; j++) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]){
                    int temp = array[i] ;
                    array[i] = array[i+1] ;
                    array[i+1] = temp ;
                }
            }
        }
        for (int arr :
                array) {
            System.out.print(arr + " ");
        }
    }
    public void sort2(){
        int array[] = {10,9,6,4,5,-1,10} ;
        int temp = array[0] ;
        for (int arr :
                array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) { //此for循环可以找出最小的那个数！
                if (temp >= array[i]){
                    temp = array[i] ;
                    continue ;
                }
            }
            array[j] = temp ;
        }
        for (int arr :
                array) {
            System.out.print(arr + " ");
        }

    }
    public void sort3(){
        String[] str = {"a","b","c","d","e"} ;
        for (String s :
                str) {
            System.out.print(s + " ");
        }
        for (int i = 0; i < str.length >> 1; i++) {
            String temp = str[i] ;
            str[i] = str[str.length - i - 1] ;
            str[str.length - i - 1] = temp ;
        }
        System.out.println();
        for (String s :
                str) {
            System.out.print(s + " ");
        }
    }
    public static void main(String[] args) {
        Sort s = new Sort() ;
//        s.sort1(); /*冒泡排序*/
//        s.sort2(); //选择排序
        s.sort3();//逆序排序
    }
}
