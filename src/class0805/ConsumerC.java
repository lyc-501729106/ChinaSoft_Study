package class0805;
//消费者
public class ConsumerC extends Thread {
    //定义仓库
    RepositoryTest repositoryTest ;
    //定义产品
    char c ;
    public ConsumerC(){}
    public ConsumerC(RepositoryTest repositoryTest){
        this.repositoryTest = repositoryTest ;
    }
    //产品的消费
    @Override
    public void run() {
        do {
            c = repositoryTest.consume() ;
        }while (c != 'D') ;
    }

}
