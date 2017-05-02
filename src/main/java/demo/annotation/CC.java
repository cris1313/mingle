package demo.annotation; /**
 * Created by owen on 2017/4/23.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CC {
    int id() default -1;
    String value() default "";
}
