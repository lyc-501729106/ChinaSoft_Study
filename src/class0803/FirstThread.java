package class0803;

import com.sun.deploy.net.proxy.ProxyUnavailableException;
//继承的方式
public class FirstThread extends Thread{ //继承Thread类
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "在执行任务");
        }
    }
}
