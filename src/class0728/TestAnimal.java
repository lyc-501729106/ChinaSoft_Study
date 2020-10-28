package class0728;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog() ;
        dog.name = "王富贵" ;
        dog.age = 2 ;
        dog.eat();
        dog.play();//重写
        Cat cat = new Cat() ;
        cat.name = "咪咪";
        cat.eat();
        cat.play();

        GrandCat gc = new GrandCat() ;
        gc.show();
    }
}
