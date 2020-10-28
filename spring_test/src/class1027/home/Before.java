package class1027.home;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 10:53
 */


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 注解前置通知
 */
@Component
@Aspect
public class Before {
    @org.aspectj.lang.annotation.Before("execution(* class1027.home.*.*(..))")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("前置通知 我得先执行" + joinPoint.getKind());
    }
}
