package class0727;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //测试Person做参数,int做返回值
        //创建ReturnClass对象
        ReturnClass rs = new ReturnClass() ;
        Person p = new Person(180.0 , 140.0) ;
        System.out.println("此方法的返回值为int:" + rs.show(p));
        //对象做参数，布尔类型做为返回值
        //只要是真或者假的返回值，或者说表达式的结果为真或者假，那么，我们就可以做为条件来使用
        if(rs.show2(p)){
            System.out.println("你的身高很合适");
        }else {
            System.out.println("不好意思，个头不够");
        }
        //对象数组做参数，数组做返回值测试
        Person[] ps = new Person[2] ;
        ps[0] = new Person(170 , 150) ;
        ps[1] = new Person(160 , 150) ;
        Arrays.toString(rs.show3(ps))  ;
        //基本数据类型做参数，String做返回值
        System.out.println("他说了一句话：" + rs.show4(20));
        //基本数据类型做参数，对象做返回值
        p = rs.show5('男') ;
        System.out.println("我们得到他的身高啦：" + p.height);
        //基本数据类型做参数，对象数组做返回值
         ps =  rs.show6(true) ;
        for (Person person:
             ps) {
            //if(person != null)
            System.out.println("这次是组团来的：" + person.height);
        }

    }
}
