package com.customer.spring.annotation.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * MainConfigTest
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
public class MainConfigTest {

    @Test
    public void testScope(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器初始化完成");
        Object person = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        System.out.println("person == person2 = " + (person == person2));
    }

}