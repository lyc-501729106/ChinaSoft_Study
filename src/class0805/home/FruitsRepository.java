package class0805.home;
//定义一个水果仓库
public class FruitsRepository {
    //定义一个水果
    String fruit ;
    //定义一个标识
    boolean flag = false ;

    //写一个生产者方法
    public synchronized void fruitProduct(String fruit){
        if (flag){
            //表示仓库有水果
            System.out.println("仓库有水果，来买吧！");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.fruit = fruit ;
        System.out.println(this.fruit + "已经生产完了，仓库有存货，来买吧！");
        flag = true ;//生产完毕
        notify(); //通知消费者来消费
    }
    //写一个消费者方法
    public synchronized String fruitConsumer(){
        if (!flag){
            System.out.println("仓库现在没有存货，请等等吧！");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false ; //表示已经卖出去了
        System.out.println(this.fruit + "已经卖出去了！赶紧生产");
        notify();
        return this.fruit ;
    }
}
