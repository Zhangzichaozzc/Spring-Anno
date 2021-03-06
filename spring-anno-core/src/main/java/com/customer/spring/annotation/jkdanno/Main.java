package com.customer.spring.annotation.jkdanno;

import java.util.Arrays;

/**
 * Main
 *
 * @author Zichao Zhang
 * @date 2021/2/28
 */
public class Main {
    /**
     * 这里的 @Demo 注解可以修饰 Class 类， Child 类 以及 Exception 是因为 Demoz注解的 @Target(@ElementType.TYPE_USE) 的作用
     * @param args
     * @throws @Demo Exception
     */
    public static void main(String[] args) throws /*@Demo */Exception {
        /*@Demo */Class</*@Demo*/ Child> childClass = Child.class;
        System.out.println("childClass.getAnnotations() = " + Arrays.toString(childClass.getAnnotations()));
        System.out.println("childClass.getAnnotationsByType(Demo.class) = " + Arrays.toString(childClass.getAnnotationsByType(Demo.class)));
        System.out.println("childClass.getAnnotation(Demo.class) = " + childClass.getAnnotation(Demo.class));

        System.out.println("childClass.getDeclaredAnnotation(Demo.class) = " + childClass.getDeclaredAnnotation(Demo.class));
        System.out.println("childClass.getDeclaredAnnotations() = " + Arrays.toString(childClass.getDeclaredAnnotations()));
        System.out.println("childClass.getDeclaredAnnotationsByType(Demo.class) = " + Arrays.toString(childClass.getDeclaredAnnotationsByType(Demo.class)));

        System.out.println("0 << 8 = " + (0 << 8));
        System.out.println("1 << 8 = " + (1 << 8 | 0));
        System.out.println("4 << 16 | 0 << 8 | 0 = " + (4 << 16 | 0 << 8 | 0));
        System.out.println("4 << 16 = " + (4 << 16 ));
    }
}
