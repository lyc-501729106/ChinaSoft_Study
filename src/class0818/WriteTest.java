package class0818;

import javax.annotation.processing.Filer;
import java.io.*;

public class WriteTest {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\test\\loginCount.txt") ;
        FileWriter fileWriter = new FileWriter(file , true) ; //这个是追加
//        FileWriter fileWriter = new FileWriter(file ) ; //这个是覆盖。因为没有true。
        String str = "雷霆" ;
        fileWriter.write(str);
        fileWriter.flush();
        fileWriter.close();
        System.out.println("---");
        FileReader fileReader = new FileReader(file) ;
        char[] c = new char[1024] ; //这个数字并不是越大越好！
        while (fileReader.read(c) != -1){
            System.out.println(c);
        }
        fileReader.close();
    }
}
