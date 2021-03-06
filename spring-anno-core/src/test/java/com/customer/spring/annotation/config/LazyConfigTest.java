package com.customer.spring.annotation.config;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * LazyConfigTest
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
public class LazyConfigTest {

    @Test
    public void testLazy(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(LazyConfig.class);
        Object animal = applicationContext.getBean("animal");
        Object anima2 = applicationContext.getBean("animal");

        System.out.println("animal == anima2 = " + (animal == anima2));

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Object.class);
        System.out.println("beanNamesForType.length = " + beanNamesForType.length);
        Arrays.stream(beanNamesForType).forEach(System.out::println);
    }

}