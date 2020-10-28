package class0730.home;

public class PrinterImpl implements Printer{
    String color = null ;
    String paper = null ;

    @Override
    public void black() {
        this.color = "black" ;
    }

    @Override
    public void chromatic() {
        this.color = "chromatic" ;
    }

    @Override
    public void A4() {
        this.paper = "A4纸" ;
    }

    @Override
    public void B5() {
        this.paper = "B5纸" ;
    }

    @Override
    public void print() {
        System.out.println(this.paper + "   " + this.color + "规格！");

    }
}
