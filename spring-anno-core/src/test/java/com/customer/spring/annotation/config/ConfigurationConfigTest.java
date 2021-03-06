package com.customer.spring.annotation.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.customer.spring.annotation.components.Cat;

/**
 * ConfigurationConfigTest
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
public class ConfigurationConfigTest {

    @Test
    public void testConfiguration(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConfigurationConfig.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println("cat.getName() = " + cat.getName());
    }

}