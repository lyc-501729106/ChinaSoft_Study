package class0729;

import java.util.Objects;

public class TestObject {
    public static void main(String[] args) {
        String str = "hello" ;
        //开发常用的判空语句
        if (!"".equals(str) && str != null){

        }

        if (str.equals("hello")){ //表示str变量调用equals方法
            System.out.println("对");
        }else {
            System.out.println("错");
        }

        if ("hello".equals(str)){//表示“hello”调用equals方法
            System.out.println("对");
        }else {
            System.out.println("错");
        }
        String card = "zang" ;  //加s 为工具， 为util 包里面的 ；
        if (Objects.isNull(card)){
            System.out.println("空");
        }else {
            System.out.println("不为空");
        }
    }
}
