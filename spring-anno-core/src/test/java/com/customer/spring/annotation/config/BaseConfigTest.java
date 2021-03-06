package com.customer.spring.annotation.config;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.customer.spring.annotation.components.Person;

/**
 * BaseConfigTest
 *
 * @author Zichao Zhang
 * @date 2021/2/28
 */
public class BaseConfigTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(BaseConfig.class);
    }

    @Test
    public void person() {
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println("person = " + person);

        Object good = applicationContext.getBean("good");
        System.out.println(good);

        Object morning = applicationContext.getBean("morning");
        System.out.println("morning = " + morning);
    }

    @Test
    public void testConponentScan(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("name = " + name);
        }
    }
}