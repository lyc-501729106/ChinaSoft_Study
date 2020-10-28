package class0727;

public class TestBike {
    //修改车的速度
    public void get(Bike bike , int speed){
        bike.changeSpeed(speed);
    }

    public static void main(String[] args) {
        Bike bike = new Bike () ;
        System.out.println(bike.show() ); ;
        new TestBike().get(bike , 20);
        System.out.println(bike.show()); ;
    }
}
