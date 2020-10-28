package class0818;

import java.io.*;

/**
 * 序列化和反序列化 目标非常熟练
 * 可以将对象存在文件中。序列化
 */
public class TestSeri {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建一个文件对象，用来存储Student对象
        File file = new File("e:/test/loginCount.txt") ;
        //创建Student对象
        Student stu = new Student() ;
        stu.setAge(20);
        stu.setName("刘莹");
        //创建FileOutputStream对象
        FileOutputStream fos = new FileOutputStream(file) ;
        //因为想要传输对象，所以创建一个对象的输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos) ;
        //进行写的操作 序列化
        oos.writeObject(stu);
        //关闭资源
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
        //反序列化操作
        //创建输入流，用来读取文件内容
        FileInputStream fis = new FileInputStream(file) ;
        //创建ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(fis) ;
        Student stu1 = (Student) ois.readObject();
        System.out.println(stu1.toString());
        //关闭资源
        ois.close();
        fis.close();
    }
}
