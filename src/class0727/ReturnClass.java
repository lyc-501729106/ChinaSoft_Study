package class0727;

import java.util.Arrays;

public class ReturnClass {
    //基本数据类型做返回值
    public int show(Person person){
        System.out.println(person.height);
        return 1 ;
    }
    public char show1(int[] ages){
        System.out.println(Arrays.toString(ages));
        return '男' ;
    }
    public boolean show2(Person person){
        System.out.println(person.height);
        if (person.height >= 180) return true ;
        else return false ;
    }
    //引用数据类型做返回值
    //数组做返回值
    public int[] show3(Person[] ps){
        for (Person p:
           ps  ) {
            System.out.println(p.height + " " + p.weigt);
        }
        int[] scores = {12 , 23, 34 ,45} ;
        return  scores ;
    }
    //String做返回值
    public String show4(int age){
        System.out.println(age);
        return  "hello" ;
    }
    //对象做返回值
    public Person show5(char sex){
        System.out.println(sex);
        return new Person(190 , 110  );
    }
    //对象数组做返回值
    public  Person[] show6(boolean flag){
        Person[] ps = new Person[2];
        if(flag) {
            ps[0] = new Person();
            ps[0].height = 180;
            ps[0].weigt = 140;
        }
        return  ps;
    }



}
