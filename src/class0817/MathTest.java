package class0817;

import java.util.Random;

/**     窥源码，知天机。
 * 数学API 最大值，最小值，两种随机数的产生方式。
 * Math.random() ; -> 产生0-1的随机double 型数
 * nextInt(4) ; -> 产生小于 4 大于等于 0 的随机整数。
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println("------------");
        System.out.println(Math.abs(-123)); //绝对值
        System.out.println(Math.max(20,30));
        System.out.println(Math.min(10,20));
        int[] age = {23,64,96,98,75,64,55,99,10,50} ;
        int max = 0 ;
        for (int i = 0; i < age.length; i++) {
            max = Math.max(max , age[i]) ;
        }
        System.out.println("age数组的最大值为:" + max);
//        Math.random() ; //随机数的表示方式,表示的是0~1之间的小数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
        //抽取幸运号码，0-9的数字
        for (int i = 0; i < 10; i++) {
            double random =  Math.random() ;
            int no = (int) (random * 10) ;
            if (no ==9){
                System.out.println("恭喜您，中奖了！");
            }else {
                System.out.println("谢谢参与！");
            }
        }
        System.out.println("-------");
        /**
         * rdm.nextInt(4) ; 表示产生小于4的随机数。窥源码，知天机！
         */
        Random rdm = new Random() ;
        for (int i = 0; i < 10; i++) {
            System.out.println(rdm.nextInt(2));
        }

    }
}
