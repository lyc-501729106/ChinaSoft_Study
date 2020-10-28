package class0814.home;

/**
 * contains() ; 此方法可以查找你源字符串里是否有该字符，如果有则返回true，如果没有则返回false
 *
 */
public class ContainsTest {
    public static void main(String[] args) {
        String str = "hello" ;
        System.out.println(str.substring(1,3));// [1,3)
        if (str.contains("h")){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
