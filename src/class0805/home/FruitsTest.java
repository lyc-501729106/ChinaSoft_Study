package class0805.home;

public class FruitsTest {
    public static void main(String[] args) {
        FruitsRepository fruitsRepository = new FruitsRepository() ;//创建库对象
        new FruitsProduct(fruitsRepository).start();//生产者
        new FruitsConsumer(fruitsRepository).start();//消费者
    }
}
