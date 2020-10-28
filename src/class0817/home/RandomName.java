package class0817.home;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomName {
    public void nameTest(){
        Map<Integer , String > map = new HashMap<>() ;
        map.put(0,"刘心如") ;
        map.put(1,"宋健") ;
        map.put(2,"王丽") ;
        map.put(3,"刘莹") ;
        map.put(4,"任博恺") ;
        map.put(5,"王宇") ;
        map.put(6,"侯艺辉") ;
        map.put(7,"安志刚") ;
        map.put(8,"汪东旭") ;
        map.put(9,"李林") ;
        map.put(10,"王天利") ;
        map.put(11,"秦小进") ;
        map.put(12,"包澳日其楞") ;
        map.put(13,"李佳伟") ;
        map.put(14,"杜欣航") ;
        map.put(15,"吕译辰") ;
        map.put(16,"侯嘉欣") ;
        map.put(17,"高源") ;
        map.put(18,"刘志敏") ;
        map.put(19,"郝过") ;
        map.put(20,"王博文") ;
        map.put(21,"石军刚") ;
        map.put(22,"邹倩") ;
        map.put(23,"裴华彬") ;
        map.put(24,"张天旭") ;
        map.put(25,"刘昭") ;
        map.put(26,"魏彦强") ;
        map.put(27,"张华斌") ;
        map.put(28,"贺君天") ;
        map.put(29,"胡雨佳") ;
        map.put(30,"成功") ;
        map.put(31,"包宏伟") ;
        map.put(32,"杨昊") ;
        map.put(33,"董豪辉") ;
        map.put(34,"姬越剑") ;
        map.put(35,"韩全英") ;
        map.put(36,"闫旭阳") ;
        map.put(37,"马小强") ;
        map.put(38,"杨媛媛") ;
        Random random = new Random() ;
        int num = random.nextInt(39) ;
        System.out.println(map.get(num));
    }
    public void nameTest2(){
        String[] str = new String[]{
                "刘心如" , "宋健" , "王丽" , "刘莹" , "任博恺" , "王宇" , "侯艺辉" , "安志刚" ,
                "汪东旭" , "李林" , "王天利" , "秦小进" , "包澳日其楞" , "李佳伟" , "杜欣航" ,
                "吕译辰" , "侯嘉欣" , "高源" , "刘志敏" , "郝过" , "王博文" , "石军刚" ,
                "邹倩" , "裴华彬" , "张天旭" , "刘昭" , "魏彦强" , "张华斌" , "贺君天" ,
                "胡雨佳" , "成功" , "包宏伟" , "杨昊" , "董豪辉" , "姬越剑" , "韩全英" ,
                "闫旭阳" , "马小强" , "杨媛媛"
        };
        Random random = new Random() ;
        int num = random.nextInt(39) ;
        System.out.println(str[num]);
    }
    public static void main(String[] args) throws InterruptedException {
        RandomName rn = new RandomName() ;
//        rn.nameTest(); //集合的方式
        rn.nameTest2(); //字符串数组的方式
    }
}
