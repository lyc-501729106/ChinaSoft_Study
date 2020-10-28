package class0723;
// 打印菱形
public class Home5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            //打印空格
            for (int k = 0; k < 5-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            //打印空格
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 7; j >=  2 * i - 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
