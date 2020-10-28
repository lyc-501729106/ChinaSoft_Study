package class0724;

public class TestPerson {
    public static void main(String[] args) {
        //创建对象
        Person p = new Person();
        //给属性赋值
        p.weigt = 140 ;
        p.height = 181 ;
        //显示内容
        System.out.println(p.height + "" +p.weigt);

        //调用有参构造方法
        p = new Person(180,150) ;
        System.out.println("有参的："+ p.weigt + " " + p.height);


        int a[] = {1,3,2};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

    }
}
