package class0805;
//生产者
public class ProductC extends Thread {
    //定义仓库
    public RepositoryTest repositoryTest ;
    //定义一个无参构造方法
    public ProductC(){

    }
    public ProductC(RepositoryTest repositoryTest){
        this.repositoryTest = repositoryTest ;

    }
    //用来进行产品的生产
    @Override
    public void run() {
        for (char i = 'A'; i < 'D'; i++) {
            repositoryTest.product(i);
        }
    }
}
