package class0819.home.daili;

public class Zqz implements Jk {
    Bzqz mm;
    public Zqz(Bzqz mm){
        this.mm = mm;
    }
    @Override
    public void getfellow() {
        System.out.println(mm.name+"送你花");
    }

    @Override
    public void getqiaokeli() {
        System.out.println(mm.name+"送你巧克力");
    }

    @Override
    public void getxiaodao() {
        System.out.println(mm.name+"送你小岛");
    }
}
