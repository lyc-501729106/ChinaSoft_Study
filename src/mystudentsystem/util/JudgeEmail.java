package mystudentsystem.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JudgeEmail {
    public static boolean email(String input){
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$" ;
        Pattern p = Pattern.compile(regex) ; //将正则表达式编译成Pattern对象
        Matcher m = p.matcher(input) ; //使用Pattern对象，生成匹配器
        //使用匹配器的matches方法进行匹配，成功返回true。
        return m.matches() ;
    }
}
