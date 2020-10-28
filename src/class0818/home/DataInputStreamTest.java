package class0818.home;

import java.io.*;

/**
 * 利用str.toUpperCase(); 可以将小写变为大写。
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream ins = new FileInputStream(new File("e:/test/loginCount.txt")) ;
        DataInputStream din = new DataInputStream(ins) ;
        DataOutputStream dou = new DataOutputStream(new FileOutputStream("E:/test/mkdir1/loginCount.txt")) ;
        int n = 0 ;
        while ((n = din.read()) != -1){
            System.out.print((char)n);
            String str = (char)n + "" ;
            str = str.toUpperCase() ;
            dou.write(str.getBytes());
        }
        dou.flush();
        dou.close();
        din.close();
        ins.close();
    }
}
