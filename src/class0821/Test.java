package class0821;

public class Test {
    public static void main(String[] args) {
        //创建代理对象
        StuProxyManagerImpl stuProxyManager = new StuProxyManagerImpl() ;
        /*if (stuProxyManager.dele(20)){
            System.out.println("做的很好了");
        }else {
            System.out.println("没有正常操作");
        }*/
        System.out.println("-------测试动态代理-------");
        StuManagerImpl stuManager = new StuManagerImpl() ;
        DongProxy dongProxy = new DongProxy(stuManager) ;
        stuManager = (StuManagerImpl) dongProxy.getProxy();
        stuManager.dele();
    }
}
