package mystudentsystem.util;

import java.io.*;

public class JudgeCount {
    public static char count() throws IOException {
        File file = new File("./src/mystudentsystem/util/loginCount.txt") ;
        System.out.println(file);
        FileInputStream fin = new FileInputStream(file) ;
        BufferedInputStream bin = new BufferedInputStream(fin) ;
        int n = bin.read() ;
        bin.close();
        fin.close();
        return (char)n ;
    }
}
