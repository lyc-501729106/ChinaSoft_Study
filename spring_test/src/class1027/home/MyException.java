package class1027.home;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 18:08
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 注解异常通知
 */
@Component
@Aspect
public class MyException {
    @AfterThrowing(pointcut = "execution(* class1027.home.*.*(..))", throwing = "e")
    public void doThrow(JoinPoint jp, Throwable e) {
        System.out.println("出错了 ！！" + e.getMessage());
    }

}
