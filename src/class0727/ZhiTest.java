package class0727;

import java.util.Arrays;

public class ZhiTest {
    public char[] test(char[] chars){
         chars[0] = '0' ;
         return chars ;
    }
    public static void main(String[] args) {
        char[] chars = {'h' , 'e'  , 'l' , 'l' , 'o'} ;
       chars = new ZhiTest().test(chars) ;
        System.out.println(Arrays.toString(chars)); ;
        int[] zhangsan = {160 , 160 } ;
        int[] lisi   = {160 , 160} ;
      //  lisi = zhangsan ;
        System.out.println("张三的信息：" + Arrays.toString(zhangsan));
        System.out.println("李四的信息：" + Arrays.toString(lisi));
        zhangsan[0] = 170 ;
        System.out.println("张三长身体啦！！！");
        System.out.println("张三的信息：" + Arrays.toString(zhangsan));
        System.out.println("李四的信息：" + Arrays.toString(lisi));
    }
}
