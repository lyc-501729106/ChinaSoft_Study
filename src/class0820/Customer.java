package class0820;

import java.util.Observable;

/**
 * 被观察者
 */
public class Customer extends Observable {
    public int score ;
    public int getScore(){
        return this.score ;
    }
    public void setScore(int score){
        if (score != this.score){
            this.score = score ;
            setChanged();//设置
            notifyObservers("我变了啊"); //唤醒观察者
        }
    }
}
