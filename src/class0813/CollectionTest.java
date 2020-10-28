package class0813;
//排序工具  Collections.sort() ; Collections.reverse() ; 降序
//这俩工具的算法。
/**
 * Collections.sort() ;  升序
 * Collections.reverse() ; 降序
 * 这俩工具的算法。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;
        list.add("ooo") ;
        list.add("rrr") ;
        list.add("aaa") ;
        list.add("ttt") ;
        list.add("hhhhhh") ;
        System.out.println("=======排序前=======");
        for (String s :
                list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("=======排序后=======");
        Collections.sort(list); //排序！！！ Arrays.sort() ;
        for (String s :
                list) {
            System.out.print(s + " " );
            //加强for循环内部使用 迭代器来实现
        }
        System.out.println();
        System.out.println("===降序了====");
        Collections.reverse(list);
        for (String s :
                list) {
            System.out.print(s + " ");
        }

    }
}
