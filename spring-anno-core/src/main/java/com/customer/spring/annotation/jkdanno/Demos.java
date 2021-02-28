package com.customer.spring.annotation.jkdanno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Demos
 *
 * @author Zichao Zhang
 * @date 2021/2/28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Inherited
public @interface Demos {
    Demo[] value();
}
