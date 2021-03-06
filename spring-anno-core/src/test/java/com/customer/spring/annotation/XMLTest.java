package com.customer.spring.annotation;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XMLTest
 *
 * @author Zichao Zhang
 * @date 2021/2/28
 */
public class XMLTest {
    @Test
    public void testXML(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object morning = applicationContext.getBean("morning");
        System.out.println("morning = " + morning);
    }
}
