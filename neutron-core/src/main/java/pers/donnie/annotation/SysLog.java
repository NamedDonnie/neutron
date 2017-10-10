package pers.donnie.annotation;

import java.lang.annotation.*;

/**
 * Created by liyudong on 2017/10/10.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
