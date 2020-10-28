package class0814.home;

/**
 * 分割字符串，并且删除这个字符。
 * 因为"."是正则表达式里的一个特殊符号，所以不会得到任何结果
 */

public class SplitTest {
    public static void main(String[] args) {
        String str = "he:ll:o" ;
        String[] str1 = str.split(":") ;
        for (String s :
                str1) {
            System.out.println(s);
        }

    }
}
