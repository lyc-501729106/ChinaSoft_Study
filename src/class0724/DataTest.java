package class0724;
//数组开山篇()Array
public class DataTest {
    public static void main(String[] args) {

//        double  zhangsan [] = {150,130};
//        double [] lisi = {150,140};
//        zhangsan[0] = 160;
//        zhangsan[1] = 160;

        Person zhangsanp = new Person() ;//创建zhangssanp对象
        zhangsanp.height = 180 ;
        zhangsanp.weigt = 140 ;
        Person lisip = new Person() ;//创建lisip对象
        lisip.height = 180 ;
        lisip.weigt = 140 ;

        Person [] persons = {zhangsanp,lisip};
        //System.out.println(zhangsan[0] + " " + zhangsan[1] + " " );

    }
}
