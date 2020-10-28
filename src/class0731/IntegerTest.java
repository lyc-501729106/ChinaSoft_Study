package class0731;

public class IntegerTest {
    public static void main(String[] args) {
        System.out.println("max:" + Integer.MAX_VALUE);
        System.out.println("min:" + Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        //客户端数组购买数量的信息
        String count = "12" ;
//        String count = "12a" ;  这报错，因为这不是纯粹的字符串数字！
        //将字符串类型的数据转换为整形。
        int buyCount = Integer.parseInt(count) ; //Integer.parseInt() ;  可以将String数字，转换为int型的！！
        System.out.println(buyCount);
        System.out.println("====");

        //数据之间可以进行自动装拆箱
        Integer no3 = 3 ;
        int no4 = no3 ;//自动拆箱
        no3 = no4 ;//自动装箱

        //面试题
        Integer no1 = 120 ;
        Integer no2 = 120 ;
        System.out.println(no1 == no2);
        no1 = 130 ;
        no2 = 130 ;
        System.out.println(no1 == no2);


    }
}
