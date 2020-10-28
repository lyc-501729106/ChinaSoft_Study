package class0728.home;

import java.util.Scanner;

public class Test {
    Scanner input = new Scanner(System.in) ;
    public void start(){
        System.out.println("1.轿车   2.客车");
        System.out.print("请输入车型：");
        String s = input.next() ;
        System.out.print("请继续输入车型:");
        String c = input.next() ;

        if ("轿车".equals(s)){

            Car car = new Car() ;
            switch(c){
                case "别克商务舱GL8" :
                    System.out.println("总价钱为:" + car.carA());
                    break;
                case "宝马550i" :
                    System.out.println("总价钱为:" + car.carB());
                    break;
                case "别克林萌大道" :
                    System.out.println("总价钱为:" + car.carC());
                    break;
                default:
                    System.out.println("抱歉！没有此车型。");
                    break;
            }
        }

        if ("客车".equals(s)){

            PassengerCar pc = new PassengerCar() ;
            switch(c){
                case "金杯" :
                    System.out.println("总价钱为:" + pc.carD());
                    break;
                case "金龙" :
                    System.out.println("总价钱为:" + pc.carE());
                    break;
                default:
                    System.out.println("抱歉！没有此车型。");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Test().start();
    }

}
