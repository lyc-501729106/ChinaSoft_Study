package class0820;

/**
 * 工厂方法模式
 */
public class MethodFactory {
    interface Car{
        public void driver();
    }
    static class BigCar implements Car{

        @Override
        public void driver() {
            System.out.println("BigCar");
        }
    }
    class SmallCar implements Car{

        @Override
        public void driver() {
            System.out.println("SmallCar");
        }
    }

    interface Factory {
        public Car anpai(String carname);
    }
    static class BigFactory implements Factory{

        @Override
        public Car anpai(String carname) {
            return new BigCar();
        }
    }

    class  SmallFactory implements  Factory{

        @Override
        public Car anpai(String carname) {
            return new SmallCar() ;
        }
    }

    public static void main(String[] args) {
        Factory factory = new BigFactory();
        Car car = factory.anpai("big");
        car.driver();
    }
}

