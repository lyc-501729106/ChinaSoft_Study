package class0817.home;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        //创建对象
        BigInteger bigInteger = new BigInteger("10");
        //阶乘
        for (int i = 1; i < 300; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println("结果为"+bigInteger.toString().length()+"位");
        System.out.println(bigInteger);
    }
}
