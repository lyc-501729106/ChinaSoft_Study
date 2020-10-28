package class1026;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author 吕译辰
 * @date 2020/10/26 - 10:24
 */
public class TestSpring {
    @Test
    public void test() {
        System.out.println("-----------使用容器前的写法------------");
        Dog dog = new Dog();
        dog.setAge(10);
        dog.setName("毛毛");
        System.out.println("狗名 ：" + dog.getName());
        System.out.println("狗龄 ：" + dog.getAge());
        System.out.println("-----------使用容器后的写法--------------");
        //创建容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //从容器中取出对象
        Dog dog1 = (Dog) context.getBean("dog");
        System.out.println("狗名 ：" + dog1.getName());
        System.out.println("狗龄 ：" + dog1.getAge());
    }

    @Test
    public void testFactory() {
        //创建spring容器
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中得到Product对象
        System.out.println("----测试静态工厂------");
        Product product = (Product) context.getBean("product");
        //操作product对象的方法
        product.test();
        System.out.println("----测试普通工厂------");
        product = (Product) context.getBean("pro");
        product.test();
    }

    @Test
    public void testSingleton() {
        //创建spring容器
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog1 = (Dog) context.getBean("dog");
        Dog dog2 = (Dog) context.getBean("dog");
        System.out.println(dog1 == dog2); //为true 地址相同，就说明默认是单例的。在配置文件里面改scope="prototype"就好了
        System.out.println("----------调用销毁方法！");
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testxx() {
        //创建spring容器
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Boy boy = (Boy) context.getBean("boy");
        System.out.println("依赖注入后的 boy.getName() : " + boy.getDog().getName());
        //基本数据类型的注入测试
        System.out.println("address : " + boy.getAddress());
        //对象的注入测试
        boy.getProduct().test();
        //集合的依赖注入测试
        List li = boy.getList();
        System.out.println("");
        if (li != null) {
            for (int i = 0; i < li.size(); i++) {
                Object obj = li.get(i);
                if (obj instanceof Dog) {
                    System.out.println(((Dog) obj).getAge());
                } else System.out.println(obj.toString());
            }
        }
        List<Dog> dogList = boy.getDogList();
        for (Dog dog :
                dogList) {
            System.out.println(dog.getName());
        }
        //map集合的依赖注入测试
        System.out.println("---map集合的依赖注入---");
        Map map = boy.getMap();
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj instanceof Product) {
                ((Product) obj).test();
            }
            if (map.get(obj) instanceof Dog){
                System.out.println(obj.toString() + " " +((Dog) map.get(obj)).getName());
            }

        }
    }

    @Test
    public void testList2() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Boy boy = (Boy) context.getBean("boy");
        List<Dog> dogList = boy.getDogList();
        for (Dog d :
                dogList) {
            System.out.println(d.getName());
        }
        System.out.println("集合的大小：" + dogList.size());
        System.out.println(boy.getAddress());
    }

    @Test
    public void setTest() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Boy boy = (Boy) context.getBean("boy");
        Set set = boy.getSet();
        System.out.println(set);
    }
    @Test
    public void mapTest(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Boy boy = (Boy) context.getBean("boy");
        Map<Integer,String> integerStringMap = boy.getIntegerStringMap();
        System.out.println(integerStringMap);
    }

}
