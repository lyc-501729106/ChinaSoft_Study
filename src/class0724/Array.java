package class0724;

public class Array {
    public static void main(String[] args) {
        //第一种方式定义数组，new 开辟空间。
        int [] score = null;
        score = new int[10];
        for (int i = 0; i < 10; i++) {
            score[i] = i ;
            System.out.print(score[i] + " ");
        }
        System.out.println();
        //数组定义的第二种方式，不使用new,
        String [] names = {"hellen","liuying","wangbowen"};
        //这种方式的数组，长度是一定的。
        //数组也可以存放对象，这种数组叫做对象数组。

        System.out.println("=======加强for=======");
        for (String name: names) {
            System.out.print(name + " ");
        }
        System.out.println();
        int a[] = {1,2,3};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
