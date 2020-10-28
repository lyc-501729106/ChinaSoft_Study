package class0728;

public class Gou {
    private String uname ;
    private int age ;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gou(){ //构造方法没有返回值，所以不能加void！！
        System.out.println("无参的构造方法");
    }
    Gou(int a ){ //缺省的

    }
    protected  Gou(String uname){
        this.uname = uname ;
        System.out.println(this.uname + "到此一游！" );
    }
    private Gou(int age , String uname){ //私有的
        this.age = age ;
        this.uname = uname ;
        System.out.println("我" + age + "岁了！" + " 我叫" + uname);

    }

    public static void main(String[] args) {
        new Gou() ;
        new Gou("tom") ;
        new Gou(20 ,"tom") ;
    }
}
