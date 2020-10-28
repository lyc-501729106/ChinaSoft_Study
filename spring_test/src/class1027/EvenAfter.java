package class1027;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 14:11
 */

import org.aspectj.lang.JoinPoint;

/**
 * 最终通知
 */
public class EvenAfter {
    public void doAfter(JoinPoint joinPoint){
        System.out.println("最终通知！！");
    }

}
