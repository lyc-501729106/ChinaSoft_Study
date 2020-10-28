package class0807;

import java.lang.reflect.Array;

public class TestArray {
    public static void main(String[] args) {
        //规定好数组的数据类型
        Class intc = int.class ;
        //创建数组实例，要求有数据类型以及数组长度
        Object obj = Array.newInstance(intc , 3) ;
        //给数组元素赋值
        Array.set(obj , 1 , 20) ;
        for (int i = 0; i < 3; i++) {
            Array.set(obj , i ,  i);
        }
        //获取到数组元素的值
        System.out.println("打印：" + Array.get(obj , 1));
        for (int i = 0; i < 3; i++) {
            System.out.println(Array.get(obj , i));
        }
    }
}
