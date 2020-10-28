package class0817;

/**
 * String 字符串不可变。
 * StringBuffer 字符串可变性。 append() ; 方法可以直接改变字符串。
 * String,StringBuffer,StringBuilder类用final修饰，所以没有子类。
 * StringBuffer 是线程安全的，StringBuilder与String 是线程不安全的。
 * StringBuffer拥有自己的字符数组，初始化大小为16, StringBuilder使用了父类的字符数组，初始大小为16
 */
public class TestStringBuffer {
    public static void main(String[] args) {
        String name = "hello" ; //字符串不可变
        StringBuffer stringBuffer = new StringBuffer("hello") ;
        stringBuffer.append("world") ;
        System.out.println("增加后的stringBuffer:" + stringBuffer);
        name.concat("world") ;
        System.out.println("string concat:" + name);
        stringBuffer.deleteCharAt(3) ;//删除下标为3 的字符
        System.out.println("删除后的stringBuffer:" +stringBuffer);
        stringBuffer.replace(2,5,"---") ;//替换[2,5)的字符为 ---
        System.out.println("替换后端的stringBuffer:" + stringBuffer);
    }
}
