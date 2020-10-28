package class1027;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 9:37
 */

public class Test {
    //测试注解
    @org.junit.Test
    public void testAvotation() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Girl girl = (Girl) context.getBean("girl");
        girl.setName("越剑");
        girl.setAge(18);
        System.out.println("名字：" + girl.getName());
        System.out.println("年龄：" + girl.getAge());
        ((ClassPathXmlApplicationContext) context).close();
    }

    //测试通知
    @org.junit.Test
    public void doActive() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("aop.xml");
        Target target = (Target) context.getBean("target");
        target.getTar("张三");
    }
}
