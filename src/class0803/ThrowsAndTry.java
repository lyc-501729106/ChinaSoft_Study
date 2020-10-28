package class0803;

interface ThrowsTry{
    public void test() throws Exception; //实现类要抛异常，必须在接口处约定好
    public void show() ;

}

public class ThrowsAndTry implements ThrowsTry{
    public void test() throws Exception{
        System.out.println("hello");
    }
    public void show(){
        try{
            System.out.println("word");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ThrowsAndTry tat = new ThrowsAndTry() ;
        tat.test();
    }
}
class Son extends ThrowsAndTry{
    public void test(){

    }
    public void show(){

    }
}
