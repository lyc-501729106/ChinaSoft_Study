package class0817.home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailTest {
    public boolean email(String str){
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$" ;
        return Pattern.matches(regex, str);
    }
    public boolean email(){
        String regex = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$" ;
        String input = "15109339079" ;
        Pattern p = Pattern.compile(regex) ; //将正则表达式编译成Pattern对象
        Matcher m = p.matcher(input) ; //使用Pattern对象，生成匹配器
        //使用匹配器的matches方法进行匹配，成功返回true。
        return m.matches() ;
    }
    public static void main(String[] args) {
        EmailTest emailTest = new EmailTest() ;
        String str = "501729106@qq.com" ;
//        String str = "asddsafaf" ;
        System.out.println(emailTest.email(str)?"邮箱校验成功！" : "邮箱校验失败！");
        System.out.println(emailTest.email()?"电话号码格式正确！" : "电话号码格式错误");
    }
}
