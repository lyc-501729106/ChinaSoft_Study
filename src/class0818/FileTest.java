package class0818;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * file.list() ;返回一个字符串数组
 * file.listFiles() ; 得到一个对象
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/test/ok") ;
        file.createNewFile() ;
        file = new File("e:/test/mkdir1") ;
        file.mkdir() ;

        file = new File("e:/test") ; //遍历当前文件夹
        System.out.println("-----测试list---------");
        String[] files = file.list() ;
        for (String f :
                files) {
            System.out.println(f);
        }
        System.out.println("-------测试listFile---------");
        File[] files1 = file.listFiles() ;
        for (File f :
                files1) {
            System.out.println("目录?" + f.isDirectory());
        }
        System.out.println("---------FileNameFilter--------");
        files = file.list(new FilenameFilter() { //FilenameFilter是一个接口，所以在此使用匿名内部类的方式来实现过滤
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
//                System.out.println(name);
                if (name.endsWith(".txt")){ //判断后缀的方法
                    System.out.println(name);
                    return true ;
                }
                return false;
            }
        }) ;
        for (String f :
                files) {
            System.out.println(f);
        }
        System.out.println("-------测试FileFilter---------");
        file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
//                System.out.println(pathname);
                if (pathname.isDirectory()) { //判断是否是目录
                    System.out.println(pathname);
                    return true;
                }
                return false;
            }
        }) ;
    }
}
