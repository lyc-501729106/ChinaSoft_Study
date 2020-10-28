package class1027.home;

import class1027.home.Target;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 17:51
 */
public class Test {
    //测试通知
    @org.junit.Test
    public void doActive() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("aopAnnotation.xml");
        Target target = (Target) context.getBean("target");
        target.getTar("李四");
    }
}
