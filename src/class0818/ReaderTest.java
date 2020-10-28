package class0818;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        //创建文件对象
        File file = new File("e:/test/loginCount.txt") ;
        //创建字符流的输入流 管道
        FileReader fileReader = new FileReader(file) ;
        //设置一个字符数组
        char[] c = new char[1024] ;
        int len = 0 ;
        while ((len = fileReader.read(c)) != -1){
            System.out.println(len);
            System.out.println(c);
            System.out.println(new String(c,0,len));
        }
        fileReader.close();
    }
}
