package class0722;


public class StringTest {
    public static void main(String[] args) {
        String name = new String("hello");
        String name2 = new String("hello");

        String a = "hello";
        String b = "hello";

        System.out.println("new地址的hello:"+(name==b));
        System.out.println(":"+(a==b));
        System.out.println(name==name2);
        //a和b同时指向hello对应的地址，所以a==b
        //name和b两个hello的地址不一样。new 就是新地址
    }

}
