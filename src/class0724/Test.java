package class0724;

public class Test {
    public static void main(String[] args) {
        //创建ClassTest对象
        ClassTest ct = new ClassTest();
        int age = 10 ;
        ct.test(age);//调用方法时候的参数叫做实参（实际参数）
        String name = "liuying";
        ct.test(name);
        //传递对象
        Person p = new Person();
        p.weigt = 140 ;
        p.height = 180 ;
        ct.test(p);
        //数组做参数
        int[] score = {11,34,345,45,};
        ct.test(score);

        //对象数组做参数
        Person[] people = new Person[2];
        people[0] = new Person() ;
        people[0].height = 100 ;
        people[0].weigt = 150 ;
        people[1] = new Person();
        people[1].height = 190 ;
        people[1].weigt = 120 ;
        ct.test(people);


    }
}
