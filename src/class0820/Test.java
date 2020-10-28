package class0820;

/**单例模式
 * 懒汉饿汉模式。
 */
public class Test {
    public static void main(String[] args) {
        TestSingle ts1 = TestSingle.getInstance() ;
        TestSingle ts2 = TestSingle.getInstance() ;
        System.out.println(ts1 == ts2);
        HungrySingle hs1 = HungrySingle.getInstance() ;
        HungrySingle hs2 = HungrySingle.getInstance() ;
        System.out.println(hs1 == hs2);
    }
}
