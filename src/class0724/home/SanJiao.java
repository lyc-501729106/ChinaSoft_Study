package class0724.home;

public class SanJiao {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int k = 9; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
