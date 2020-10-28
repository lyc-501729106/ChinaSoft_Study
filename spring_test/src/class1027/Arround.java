package class1027;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 14:15
 */

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 环绕通知
 */
public class Arround {
    //为了执行目标程序，我们需要ProceedingJoinPoint参数
    public void getArround(ProceedingJoinPoint proceedingJoinPoint){
        //执行目标程序
        System.out.println("我是前置程序");
        try {
            //执行目标程序
            Object obj = proceedingJoinPoint.proceed();
            System.out.println("我是后置程序");
        } catch (Throwable throwable) {
            System.out.println("我是异常程序啊");
            throwable.printStackTrace();
        }
        System.out.println("我是最终程序");
    }
}
