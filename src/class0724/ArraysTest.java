package class0724;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] scores = {11, 0 , 365 , 45 ,68 ,896};
        System.out.println("======排序前========");
        for (int s:scores){
            System.out.print(s + " ");
        }
        //使用arrays工具进行排序
        Arrays.sort(scores);// 因为sort方法为静态方法，所以可以直接使用类名，方法名即可
        System.out.println();
        System.out.println("======排序后=======");
        for (int s : scores){
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("======toString测试======");
        System.out.println(scores.toString());//此方式打印的是scores数组的地址
        System.out.println(Arrays.toString(scores)); //以字符串方式打印
    }
}
