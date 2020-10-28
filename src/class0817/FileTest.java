package class0817;

import java.io.File;
import java.io.IOException;

/**
 *  ./ 表示当前项目文件夹下
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt") ;
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件创建失败");
        }
        file = new File("./aaa") ;
        if (file.mkdir()) {
            System.out.println("文件夹创建成功");
        } else {
            System.out.println("文件夹创建失败");
        }
    }
}
