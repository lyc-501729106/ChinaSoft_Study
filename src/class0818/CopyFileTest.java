package class0818;

import java.io.*;

/**
 * 一个文件用流来拷贝
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        //创建需要复制的视频对象
        File old = new File("e:/test/ok.wmv") ;
        //创建目标视频对象
        File newFile = new File("e:/test/mkdir1/newok.wmv") ;
        //输入流对象
        FileInputStream fis = new FileInputStream(old) ;
        //输出流对象
        FileOutputStream fos = new FileOutputStream(newFile) ;
        int len = 0 ;
        while ((len = fis.read()) != -1){
            fos.write(len);
            System.out.print(len);
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
