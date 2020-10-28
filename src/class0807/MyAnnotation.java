package class0807;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//当目标定义为FIELD的时候， 只能在属性上用,用在方法上，会报出异常
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
