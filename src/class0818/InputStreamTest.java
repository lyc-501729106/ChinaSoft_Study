package class0818;
/**
 * 字节流
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建需要读取的对象
        File file = new File("E:/test/loginCount.txt") ;
        //创建FileInputStream流对象，即将File对象与流对象进行关联
        FileInputStream fis = new FileInputStream(file) ;
        int len = 0 ; //用来接收读取的字符
        try {
            len = fis.read() ;
            System.out.println((char)len);

            while ((len = fis.read()) != -1){
                System.out.print((char)len);
            }
        } finally {
            fis.close(); //关闭资源
        }
    }
}
