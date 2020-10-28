package class0818.home;

import java.io.*;

public class PushbackInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/test/loginCount.txt") ;
        FileOutputStream fos = new FileOutputStream(file) ;
        BufferedOutputStream bos = new BufferedOutputStream(fos) ;
        String str = "hello world" ;
        bos.write(str.getBytes());
        bos.flush();
        bos.close();
        fos.flush();
        fos.close();

        file = new File("e:/test/loginCount.txt") ;
        FileInputStream fis = new FileInputStream(file) ;
        BufferedInputStream bis = new BufferedInputStream(fis) ;
        int len = 0 ;
        String str1 = "" ;
        while ((len = bis.read()) != -1){
            System.out.print((char)len);
//            str1 = str1.concat((char)len +"") ;
            str1 = str1.concat(Character.toString((char)len)) ; //这是两种将字符变为字符串的方式。
        }
        /**************************************/
        ByteArrayInputStream bais = new ByteArrayInputStream(str1.getBytes()) ;
        java.io.PushbackInputStream pis = new java.io.PushbackInputStream(bais) ;
        int n ;
        while ((n = pis.read()) != -1){
            System.out.print((char)n);
            if (n == 'o') {
                pis.unread('T'); //回推b 的低字节。
            }
        }
    }
}
