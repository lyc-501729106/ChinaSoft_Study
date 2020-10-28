package class0813;

import java.util.Stack;

/**
 * stack.push() ;
 * stack.size() ;
 * stack.pop() ; 查看后删除一个
 * stack.peek() ; 不删除查看一个
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack() ;
        stack.push("hello") ;
        stack.push(111) ;
        stack.push(new StackTest()) ;
        stack.push(2) ;
        System.out.println(stack.size());
        System.out.println(stack.pop()); //删除一个 尾部 2
        System.out.println("pop后:" + stack.size());
        System.out.println(stack.peek()); //不删除
        System.out.println("peek后:" + stack.size());
    }
}
