package class1027;

/**
 * @author 吕译辰
 * @date 2020/10/27 - 10:53
 */


import org.aspectj.lang.JoinPoint;

/**
 * 切面程序
 */
public class Before {
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("我得先执行" + joinPoint.getKind());
    }
}
