package class0820;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Look implements Observer {
    //创建构造方法，关联被观察者。
    public Look(){}
    public Look(Observable observable){
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("你变了:" + ((Customer)o).getScore());
        System.out.println("arg:" + arg.toString());
    }
}
