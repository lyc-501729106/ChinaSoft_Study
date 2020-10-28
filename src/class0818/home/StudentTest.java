package class0818.home;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student[] stu = new Student[3] ;
        stu[0] = new Student("rose" , 20);
        stu[1] = new Student("刘莹" , 21) ;
        List<Student> list = new ArrayList<Student>() ;
        list.add(stu[0]) ;
        list.add(stu[1]) ;
        File file = new File("e:/test/student.txt") ;
        file.createNewFile() ;
        FileOutputStream fos = new FileOutputStream(file) ;
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(fos) ;
        oos.writeObject(list);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
        //反序列化
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file)) ;
        list = (List<Student>) oin.readObject();
        System.out.println(list);
        oin.close();
    }
}
