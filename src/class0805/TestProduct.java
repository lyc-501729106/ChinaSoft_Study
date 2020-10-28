package class0805;

public class TestProduct {
    public static void main(String[] args) {
        //创建仓库对象
        RepositoryTest repositoryTest = new RepositoryTest() ;
        //创建并启动生产者线程
        new ProductC(repositoryTest).start();
        //创建并启动消费者线程
        new ConsumerC(repositoryTest).start();
    }
}
