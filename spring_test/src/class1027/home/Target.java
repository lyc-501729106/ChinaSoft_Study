package class1027.home;

import org.springframework.stereotype.Component;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 17:46+
 */
@Component("target")
public class Target {
    public String getTar(String name) {
        System.out.println("我是真正的目标啊！！");
//        int a = 10 / 0;
        return name;
    }
}
