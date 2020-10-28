package class0817;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalTest {
    public static void main(String[] args) {
        //创建国际化对象
        Locale locale1 = new Locale("zh" , "CN") ;
        Locale locale2 = new Locale("en" , "US") ;
        //获取资源
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("class0817/message" , locale1) ;
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("class0817/test" , locale2) ;
        //根据key值获取到value值
        System.out.println(resourceBundle1.getString("msg.login.show"));
        System.out.println(resourceBundle1.getString("msg.login.fail"));
        System.out.println(resourceBundle2.getString("show"));
        System.out.println(resourceBundle2.getString("test"));

    }
}
