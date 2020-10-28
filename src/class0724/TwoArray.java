package class0724;

public class TwoArray {
    public static void main(String[] args) {
        int[] [] mi = { {1,0,0} , {1,0}};
        System.out.println(mi.length);//二维数组里元素的个数
        System.out.println(mi[0].length);//第一个元素里，值的个数
        System.out.println(mi[1].length);//第二个元素里，值的个数
        for (int i = 0; i < mi.length; i++) {
            for (int j = 0; j < mi[i].length; j++) {

                System.out.print(" " + mi[i][j]);
            }
            System.out.println();
        }
    }
}
