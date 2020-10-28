package class0731;

public class LamdaTest {
    //需要定义一个接口，约定需要的操作
    @FunctionalInterface   //此注解表示只能有一个约定！
    public interface MathOperater{
        public int operater(int a , int b ) ;
        default void get(){
            //但是可以有default 方法！！
        }
        default void getOne(){

        }
    }
    //定义一个方法，用来进行参数的传递，即将参数a，b 以及接口进行传递
    public int getNo(int a , int b  , MathOperater mathOperater){
        return mathOperater.operater( a , b) ;
    }
    //定义一个接口
    public interface SayHello {
        public void say(String massage) ;
    }
    public interface SayHello1{
        public void say() ;
    }
    public static void main(String[] args) {
        SayHello sayHello = (massage) -> System.out.println(massage) ;
        sayHello.say("吃饭了没");
        SayHello1 sayHello1 = () -> System.out.println("吃了") ;
        sayHello1.say();

        //创建当前对象
        LamdaTest lamdaTest = new LamdaTest() ;
        //使用Lamda表达式完成之前的实现类的操作
        MathOperater jia = (int a , int b ) -> a + b ;
        MathOperater jian = (int a , int b ) -> a - b ;
        MathOperater chen = (int a , int b ) -> a * b ;
        MathOperater chu = (int a , int b ) -> a / b ;
        System.out.println("10 + 20 = " + lamdaTest.getNo(10,20 , jia));
        System.out.println("10 - 20 = " + lamdaTest.getNo(10,20 , jian));
        System.out.println("10 * 20 = " + lamdaTest.getNo(10,20 , chen));
        System.out.println("10 / 20 = " + lamdaTest.getNo(10,20 , chu));
    }

}
