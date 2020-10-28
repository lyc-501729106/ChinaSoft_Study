package class0731.home;

public class Printer {
    //纸张接口
    public interface Paper{
        public void paper () ; //约定
    }
    //颜色接口
    public interface Color{ //约定
        public void color () ;
    }
    public void printer(Paper paper , Color color){ //多态
        paper.paper();
        color.color();
    }

    public static void main(String[] args) {
        Paper A4 = () -> System.out.println("使用A4纸") ;  //左边接口，右边实现类
        Paper B5 = () -> System.out.println("使用B5纸") ;
        Color black = () -> System.out.println("黑色笔迹") ;
        Color chromatic = () -> System.out.println("彩色笔迹") ;
        Printer p = new Printer() ;
        p.printer(A4 , black);
        System.out.println("====");
        p.printer(B5 , chromatic);
    }
}
