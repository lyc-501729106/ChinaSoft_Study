package class0814;

import java.io.UnsupportedEncodingException;

/**
 *
 */
public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = new String(new char[]{'a' , 'b' , 'c'}) ;
        String str2 = "hello" ;
        String str3 = new String() ; //this.value = "".value ;
        System.out.println("str1:" + str1.length());
        System.out.println("str2:" + str2.length());
        System.out.println("str3:" + str3.length());
        System.out.println("分解str2");
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i) + "-");
        }
        String str4 ="你好，你好" ;
        new String (str4.getBytes("iso-8859-1") , ("utf-8"));
    }
}
