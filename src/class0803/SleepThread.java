package class0803;

public class SleepThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); //设置休眠！
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行：" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepThread st = new SleepThread() ;
        Thread.sleep(1000);
        st.start();
    }
}
