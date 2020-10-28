package class0821;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class DongProxy implements InvocationHandler {
    //定义目标对象
    Object target ;
    //创建构造方法
    public DongProxy(){

    }
    public DongProxy(Object object){
        this.target = object ;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
    //获取到代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this) ;
    }
}
