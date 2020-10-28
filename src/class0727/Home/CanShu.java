package class0727.Home;

import java.util.Arrays;

public class CanShu {
    public String test(String a , int ... b){

        for (int i = 0; i < b.length; i++) {
            System.out.println(a + ": "+Arrays.toString(b));
        }

        return null;

    }

    public static void main(String[] args) {
        new CanShu().test("各科成绩" , 20,30,60) ;
    }

}
