package class0818;

import java.io.*;

/**
 * Buffer
 */
public class VipCopyFileTest {
    public static void main(String[] args) throws IOException {
        //创建需要复制的视频对象
        File old = new File("e:/test/ok.wmv") ;
        //创建目标视频对象
        File newFile = new File("e:/test/mkdir1/newok.wmv") ;
        //输入流对象
        FileInputStream fis = new FileInputStream(old) ;
        //输出流对象
        FileOutputStream fos = new FileOutputStream(newFile) ;
        //将输入流添加到缓冲流中
        BufferedInputStream bis = new BufferedInputStream(fis) ;
        //将输出流转换为缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(fos) ;
        //定义一个byte数组来读写文件
        byte[] s = new byte[1024] ;
        int len = 0 ;
        while ((len = bis.read(s)) != -1){
            bos.write(s,0,len);
//            bos.write(s);
            System.out.println(len);
        }
        //关闭资源
        bos.close();
        fos.close();
        bis.close();
        fis.close();
    }
}
