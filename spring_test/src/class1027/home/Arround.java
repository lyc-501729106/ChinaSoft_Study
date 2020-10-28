package class1027.home;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 14:15
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 注解环绕通知
 */
@Component
@Aspect
public class Arround {
    //为了执行目标程序，我们需要ProceedingJoinPoint参数
    @org.aspectj.lang.annotation.Around("execution(* class1027.home.*.*(..))")
    public void getArround(ProceedingJoinPoint proceedingJoinPoint){
        //执行目标程序
        System.out.println("我是around前置程序");
        try {
            //执行目标程序
            Object obj = proceedingJoinPoint.proceed();
            System.out.println("我是around后置程序");
        } catch (Throwable throwable) {
            System.out.println("我是around异常程序啊");
            throwable.printStackTrace();
        }
        System.out.println("我是around最终程序");
    }
}
