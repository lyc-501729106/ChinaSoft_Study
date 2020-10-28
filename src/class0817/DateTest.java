package class0817;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date() ; //得到当前日期。
        System.out.println("转换前:" + date);
        String str = "2010/07/08" ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd") ;
        String s = sdf.format(date) ;
        System.out.println("转换后:" + s);
        //这种方式已经过时，但是也使用的是parse
        date = new Date(s) ;
        System.out.println(date);

        date = sdf.parse(str) ;
        System.out.println(date);
    }
}
