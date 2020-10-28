package class0724;

public class ClassTest {
    //无参数方法
    public void test(){

    }
    //基本数据类型做参数方法
    public void test(int age){
        System.out.println("age:" + age);
    }
    //字符串做参数，引用数据类型做参数
    public void  test(String name){
        System.out.println("name:" + name);
    }
    //对象做参数
    public void test(Person person){
        System.out.println("此人身高" + person.height + "此人体重" + person.weigt);
        System.out.println("周末在干什么？");
        person.study();
    }
    //数组做参数
    public void test(int[] score){
        for (int s : score){
            System.out.println(s + "");
        }
    }
    //对象数组做参数
    public void test(Person[] ps){
        for (Person p: ps
             ) {
            System.out.println("身高：" + p.height + "体重" + p.weigt);
        }
    }
}
