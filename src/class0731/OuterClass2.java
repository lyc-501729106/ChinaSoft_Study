package class0731;

/**
 * 局部内部类！
 */
public class OuterClass2 {
    String name ;
    int age ;
    public void test(){
        class InnerClass{
            public void show(){
                name = "xiha" ;
                age = 20 ;
                System.out.println(name + " " + age);
            }
        }
        //创建局部内部类对象
        InnerClass innerClass = new InnerClass() ;
        innerClass.show();
    }

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2() ;
        outerClass2.test() ;
    }
}
