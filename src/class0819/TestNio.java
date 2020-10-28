package class0819;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * 文件比较大的时候，可以用Nio来传输。 缓冲区
 * NIO和IO之间最大的区别是：IO是面向流的，NIO是面向块（缓冲区）的
 *
 * Java IO面向流意味着每次从流中读一个或多个字节，直至读取所有字节，它们没有被缓存在任何地方。
 * 此外，它不能前后移动流中的数据。如果需要前后移动从流中读取的数据，需要先将它缓存到一个缓冲区。
 * Java NIO的缓冲导向方法略有不同。数据读取到一个它稍后处理的缓冲区，需要时可在缓冲区中前后移动。
 * 这就增加了处理过程中的灵活性
 */
public class TestNio {
    public static void main(String[] args) throws IOException {
        //创建需要复制的视频对象
        File old = new File("e:/test/ok.wmv") ;
        //创建目标视频对象
        File newFile = new File("e:/test/mkdir1/newok.wmv") ;
        //输入流对象
        FileInputStream fis = new FileInputStream(old) ;
        //输出流对象
        FileOutputStream fos = new FileOutputStream(newFile) ;
        //使用NIO来完成对象对的传输
        FileChannel in = fis.getChannel() ;
        FileChannel out = fos.getChannel() ;
        in.transferTo(0,in.size(),out) ;
        //关闭资源
        out.close();
        fos.close();
        in.close();
        fis.close();
    }
}
