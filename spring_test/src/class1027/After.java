package class1027;

import org.aspectj.lang.JoinPoint;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 11:39
 */
public class After {
    public void getAfter(JoinPoint joinPoint, Object obj) {
        System.out.println("返回值为 " + obj);
    }
}
