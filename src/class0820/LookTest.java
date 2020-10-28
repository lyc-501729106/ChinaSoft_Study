package class0820;

public class LookTest {
    public static void main(String[] args) {
        //创建被观察者对象
        Customer customer = new Customer() ;
        //创建观察者对象
        Look look = new Look(customer) ;
        customer.setScore(2);
        customer.setScore(3);
        customer.setScore(4);
    }
}
