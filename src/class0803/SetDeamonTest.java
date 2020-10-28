package class0803;

public class SetDeamonTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello" + i);
        }

    }

    public static void main(String[] args) {
        SetDeamonTest sdt = new SetDeamonTest() ;
        sdt.setDaemon(true); //守护线程，一般情况下将线程设置为守护线程，则表示任务已经完成，程序终止
        sdt.start();
    }
}
