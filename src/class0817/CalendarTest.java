package class0817;

import java.util.Calendar;

/**
 * add不行找set ...
 */
public class CalendarTest {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance() ;
        calendar.add(Calendar.YEAR,20); //当前年+20年
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.YEAR,2022);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH , 8);
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH,17);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //***********
        calendar.set(2020,8,17);
        System.out.println("当前为:"
                + calendar.get(Calendar.YEAR) + "年"
                + calendar.get(Calendar.MONTH) + "月"
                + calendar.get(Calendar.DAY_OF_MONTH) + "日");

    }
}
