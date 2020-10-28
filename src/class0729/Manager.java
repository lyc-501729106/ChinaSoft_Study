package class0729;

public class Manager {
    //喂养宠物
    public void feed(Pet pet){
        pet.eat();

        if (pet instanceof Cat){
            Cat cat = (Cat) pet ; //向下转型 -> 强转

            cat.eat();
            cat.play();
        }
    }

}
