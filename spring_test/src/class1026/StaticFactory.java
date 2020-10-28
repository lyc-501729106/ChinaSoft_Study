package class1026;

/**
 * @author 吕译辰
 * @date 2020/10/26 - 11:04
 */
public class StaticFactory {
    //通过调用静态方法获取到目标对象
    public static Product getPro(){
        return  new Product();
    }
}
