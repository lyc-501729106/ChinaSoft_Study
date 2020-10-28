package class1027.home;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 18:04
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 注解后置通知
 */
@Component
@Aspect
public class After {
    @AfterReturning(pointcut="execution(* class1027.home.*.*(..))",returning="obj")
    public void getAfter(JoinPoint joinPoint, Object obj) {
        System.out.println("后置通知 返回值为 " + obj);
    }
}
