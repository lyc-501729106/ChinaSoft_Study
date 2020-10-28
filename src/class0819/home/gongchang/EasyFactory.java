package class0819.home.gongchang;

public class EasyFactory {
    public static Operation Choose(String choose){
        Operation ope =new Operation();
        if ("+".equals(choose))
            ope = new Add();
        else if ("-".equals(choose))
            ope = new Sub();
        else if ("*".equals(choose))
            ope = new Mul();
        else if ("/".equals(choose))
            ope = new Div();
        return ope;
    }
}
