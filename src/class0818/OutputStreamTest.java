package class0818;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建需要写入的对象
        File file = new File("e:\\test\\loginCount.txt") ;
        //创建一个FileOutputStream流对象，与文件相关联。
        FileOutputStream fos = new FileOutputStream(file,true) ;//带true就是追加。
        String str = "helloworld" ;
        try {
            fos.write(str.getBytes());
//            fos.write('x');
        } finally {
            fos.flush();//刷新
            fos.close();
        }
    }
}
