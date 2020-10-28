package class0723;

public class ContinueTest {
    public static void main(String[] args) {
        int a = 0;

            for (int i = 0; i < 10; i++) {
                if (i % 3 == 0){
                    System.out.println("控");
                    continue;
                }
                System.out.println("i:"+ i);
            }


    }
}
