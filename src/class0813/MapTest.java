package class0813;

import java.util.*;

/**
 * map.put() ;存入一个键值对
 * map.get() ; 查询一个键的值
 * map.keySet() ; 获取到所有的key值
 * map.remove() ; 删除一个键值对
 * HashMap() 是非线程安全的，
 * Hashtable（） 是线程安全的
 */
public class MapTest {
    public static void main(String[] args) {
        //键值对存储，key不可以重复，value可以重复
        Map<String , Integer> map = new HashMap<>() ;
        Map<String , Integer> map1 = new Hashtable<>() ;
        map.put("one" , 1) ;
        System.out.println("当前map的大小为:" + map.size());
        map.put("one" , 111) ;
        System.out.println("当前map的大小为:" + map.size());
        map.put("two" , 2) ;
        map.put("three" , 3) ;
        System.out.println("当前map的大小为:" + map.size());
        //查看map信息
        System.out.println("one:" + map.get("one")); //key值相同，不会添加新信息，会修改value的值
        //获取到所有的key 值
        Set<String> set = map.keySet() ;
        Iterator<String> it = set.iterator() ;
        while (it.hasNext()){
            String key = it.next() ;
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();
        //删除key和value
        System.out.println("===删除后的===");
        map.remove("two") ;
        Iterator<String> it1 = set.iterator() ;
        while (it1.hasNext()){
            String key = it1.next() ;
            System.out.println(key + " " + map.get(key));
        }

    }
}

