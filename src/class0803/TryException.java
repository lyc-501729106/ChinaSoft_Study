package class0803;

public class TryException {
    public static void main(String[] args) {
        try{
            int i = 0 ;
            System.out.println(10 / 0);
        }catch(Exception e){
            //在控制台打印异常的原因
            e.printStackTrace();
            System.out.println("哇咔咔，出错了呀");
            System.out.println("进入到登录页面");
            System.exit(0) ; //System.exit(0) 后面的finally不会执行！
        }finally{
//            System.out.println("当前i的值为:" + i);
            System.out.println("无论如何，都会执行的，-> finally");
        }

    }
}
