package class0805;
//仓库  生产者消费者模式 非常重要！！！
public class RepositoryTest {
    //定义产品
    char c ;
    //定义一个标识，用来表示仓库中是否有此产品
    boolean flag ;
    //定义一个生产者方法
    public synchronized void product(char c){
        if (flag){
            //仓库中有产品
            System.out.println("仓库中有产品，赶紧卖！");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.c = c ; //生产产品C
        System.out.println(c + " 生产完了，赶紧卖吧");
        flag = true ; //修改仓库有产品的标识，表示仓库有产品了
        notify(); // 唤醒消费者
    }
    //定义一个消费者
    public synchronized char consume(){
        if (!flag){
            //表示仓库没有产品
            System.out.println("仓库啥也没有，不能卖，只能休假");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false ; //表示仓库的状态，表示产品卖出去了
        System.out.println(this.c + "卖出去了，赶紧再生产吧！");
        notify(); //唤醒生产者
        return this.c ;
    }
}
