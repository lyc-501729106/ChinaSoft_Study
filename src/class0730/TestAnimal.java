package class0730;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Dog() ;
        a.name = "富贵" ;
        a.eat();
        a.test();
        System.out.println("====");
        a= new Cat() ;
        a.age = 6 ;
        a.eat();
        a.test();
//        a = new Animal() ; 抽象类不可以实例化
        new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        } ;


    }
}

