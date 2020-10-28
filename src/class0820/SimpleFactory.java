package class0820;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Factory factory = new Factory() ;
        Car car = (Car) factory.anpai("middle");
        car.drive();
    }
}
//定义一个车的接口
interface Car{
    public void drive() ;
}
//实现类
class BigCar implements Car {
    @Override
    public void drive() {
        System.out.println("今天开大车。");
    }
}
class MiddleCar implements Car {

    @Override
    public void drive() {
        System.out.println("今天开中型车");
    }
}
class Factory{
    public Car anpai(String cars) {
        if ("big".equals(cars)) {
            return new BigCar();
        }else if ("middle".equals(cars)){
            return new MiddleCar() ;
        }else{
            new RuntimeException("没有这个车型") ;
        }
        return null ;
    }
}
