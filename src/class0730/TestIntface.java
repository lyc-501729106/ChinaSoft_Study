package class0730;

public class TestIntface {
    public static void main(String[] args) {
//        FirstInterface.NAME //能点出来，说明是静态的 ；
        /**
         * 类名.常量 -> 说明接口中的属性都是static的
         * 对象.变量 -> 普通类里面的属性不是static的
         */
        //测试接口对象
        FirstInterface fi = new FirstInterfaceImpl() ;//左方接口，右方实现类！多态的使用
        fi.test();
    }
}
