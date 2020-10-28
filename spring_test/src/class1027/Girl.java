package class1027;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 9:36
 */
@Component
public class Girl {
    private String name;
    private int age;
    //初始化注解
    @PostConstruct
    public void first(){
        System.out.println("我是第一");
    }
    //销毁注解
    @PreDestroy
    public void secend(){
        System.out.println("我是第二");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
