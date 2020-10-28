package class0820;

public class HungrySingle {
    private HungrySingle(){
        System.out.println("HungrySingle-饿汉模式");
    }
    private static HungrySingle hungrySingle = new HungrySingle() ;
    public static HungrySingle getInstance(){
        return hungrySingle ;
    }
}
