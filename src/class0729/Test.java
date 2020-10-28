package class0729;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager() ;

        Pet pet = new Dog() ; //父类引用子类对象 -> 向上转型
        pet.name = " 富贵" ;
        manager.feed(pet);
        pet = new Cat() ;
        pet.age = 2 ;

        manager.feed(pet);

    }
}
