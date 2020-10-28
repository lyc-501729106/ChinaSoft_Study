package class1027;

import org.aspectj.lang.JoinPoint;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 11:50
 */
public class MyException {
    public void getException(JoinPoint joinPoint, Throwable e) {
        System.out.println("报错了 ：" + e.getMessage());
    }
}
