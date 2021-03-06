package com.customer.spring.annotation.config;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.customer.spring.annotation.components.OperatingSystem;

/**
 * ConditionConfigTest
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
public class ConditionConfigTest {

    @Test
    public void testConditional() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConditionalConfig.class);
        Map<String, OperatingSystem> beansOfType = applicationContext.getBeansOfType(OperatingSystem.class);
        for (Map.Entry<String, OperatingSystem> entry : beansOfType.entrySet()) {
            System.out.println("entry.getKey() + \": \" + entry.getValue() = " + (entry.getKey() + ": " + entry.getValue()));
        }
    }

}