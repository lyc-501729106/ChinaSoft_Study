package class1027.home;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 18:11
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 注解最终通知
 */
@Component
@Aspect
public class EvenAfter {
    @After(value="execution(* class1027.home.*.*(..))")
    public void evenAfter(JoinPoint joinPoint){
        System.out.println("最终通知finally！");
    }
}
