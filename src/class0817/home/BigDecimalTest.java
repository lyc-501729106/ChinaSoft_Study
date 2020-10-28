package class0817.home;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("3.34548156894561");
        BigDecimal bigDecimal2 = new BigDecimal("3.014894515615481564165498");
        //加法
        BigDecimal result1 = bigDecimal1.add(bigDecimal2);
        System.out.println("两数相加: "+result1);
        //减法
        BigDecimal result2 = bigDecimal1.subtract(bigDecimal2);
        System.out.println("两数相减: "+result2);
        //乘法
        BigDecimal result3 = bigDecimal1.multiply(bigDecimal1);
        System.out.println("两数相乘: "+result3);
        //除法
        BigDecimal result4 = bigDecimal1.divide(bigDecimal2);
        System.out.println("两数相除:"+ result4);

    }
}

