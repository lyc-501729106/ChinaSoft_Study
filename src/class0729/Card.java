package class0729;

public class Card {
    private int cid ;
    private double money ;
    public String name ;

    //一对一的体现
    private  Person person ;
    //一张卡多人来使用
    private Person[] persons ;

    public Card(){
        System.out.println("我是Card的构造方法");
    }

}
