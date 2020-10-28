package class0817;

/**
 * StringBuilder ,与StringBuffer很像，但是不是线程安全的。
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder() ;
        stringBuilder.append("helloworld") ;
        stringBuilder.deleteCharAt(3) ;
        stringBuilder.replace(2,5,"---") ;
        System.out.println(stringBuilder);
    }
}
