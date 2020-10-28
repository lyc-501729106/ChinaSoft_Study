package class0731;

public class CharacterTest {
    public static void main(String[] args) {
        String str = "dfjlkjg354634sdkjfslGJIF" ;
        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i) + " ");//测试
            char c = str.charAt(i) ; //单个取出来字符串，
            if (Character.isDigit(c)){ //判断单个的字符串是否为数字  Character.isDigit() ;
                System.out.println(c + "是数字！");
            }
        }
    }
}
