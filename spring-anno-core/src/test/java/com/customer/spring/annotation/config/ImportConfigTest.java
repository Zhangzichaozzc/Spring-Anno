package com.customer.spring.annotation.config;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ImportConfigTest
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
public class ImportConfigTest {

    @Test
    public void testImport(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

}