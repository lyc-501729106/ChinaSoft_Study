package class0729;

public class Person {
    private String name ;
    private int age ;
    //当人与卡之间是一对一的关系时
    private Card card ; //使用类对象来体现一对一的关系或者是 多对一 的关系，即：Card为一，而Person为多
    //当一个人有多张卡的时候，即 Card 为多
    private Card[] cards ;

}
