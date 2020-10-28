package class0803;

import java.io.IOException;

public class ThrowException {
    public static void main(String[] args) throws IOException {
        char sex = '女' ;

//        if (sex == '女'){
//            throw new RuntimeException("抛出一个异常!下面的代码不会执行！") ;
//        }
//        System.out.println("这句不会被执行");
        ThrowException te = new ThrowException() ;
        te.test2();
    }
    public void test2() throws IOException{  //声明异常
        throw new IOException("输入输出出现问题了") ;
    }
}
