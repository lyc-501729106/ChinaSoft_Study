package class0722;

public class DataTest {
    public static byte no1=10;
    public static short no2;
    public static int no3;
    public static long no4;
    public static float no5;
    public static double no6;
    public static boolean flag;
    public static char sex;

    public static void main(String[] args) {
//        double no3=3.00;
//        System.out.println(no3);
        no2 = no1 ;
        no1 =(byte)no2 ;
        no6 = no2 ;
        System.out.println(sex = (char) no1);
        System.out.println(no1 = (byte) sex);
        System.out.println(sex + 5);

        System.out.println(no1+" "+no2+" "+no3+" "+no4+" "+no5+" "+no6+" "+flag+" "+sex+"");
    }
}
