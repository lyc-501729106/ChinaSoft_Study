package class0731;

/**
 * 成员内部类
 */

public class OuterClass {
    String name = "A" ;
    String name2 = "B" ;
    public class InnerClass{ //内部类
        public void start(){
            System.out.println(name);
        }
        public class Inner2Class{
            public void start(){
                System.out.println(name2);
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 测试成员内部类!
         */
        OuterClass oc = new OuterClass() ;
        OuterClass.InnerClass innerClass = oc.new InnerClass() ;
        innerClass.start();

        OuterClass.InnerClass.Inner2Class inner2Class = innerClass.new Inner2Class() ;
        inner2Class.start();
    }
}
