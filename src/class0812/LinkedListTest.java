package class0812;

/**
 * 与ArrayList一样，LinkedList也是非线程安全的。
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List list = new LinkedList() ;
        list.add("hello") ;
        list.add(0 , "word") ;
        ((LinkedList)list).addFirst("first") ;
        ((LinkedList)list).addLast("last");
        System.out.println(((LinkedList) list).getFirst());
        System.out.println(((LinkedList) list).getLast());
        List<String> ll = new LinkedList<String>() ;
        ll.add("first") ;
        ll.add("last") ;
        System.out.println("//第一种遍历方式");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        System.out.println("//第二种遍历方式");
        for (String s :
                ll) {
            System.out.println(s);
        }
        System.out.println("//第三种遍历方式");
        Iterator it = ll.iterator() ;
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
