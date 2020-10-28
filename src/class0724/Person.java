package class0724;

public class Person {
        public double weigt;
        public double height;
        public  Person(){
                System.out.println("我是无参构造方法");
        }
        //无参的构造方法
        public Person(double h, double w){
                this.height = h;
                this.weigt = w ;
        }
        public void study(){
                System.out.println("周末学习");
        }
}
