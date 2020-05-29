package com.unfair.annotation;/*
 * @author Ferao
 * @date
 * @discription
 */

import java.lang.annotation.*;

@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {

    String module()   default "";
    String methods()  default "";
}
