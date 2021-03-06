package com.customer.spring.annotation.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * FactoryBeanConfigTest
 *
 * @author Zichao Zhang
 * @date 2021/3/7
 */
public class FactoryBeanConfigTest {

    @Test
    public void testFactoryBean(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Object myFactoryBean = applicationContext.getBean("myFactoryBean");
        System.out.println(myFactoryBean.getClass());
        // org.springframework.beans.factory.BeanFactory.FACTORY_BEAN_PREFIX 定义了去FactoryBean自己的bean的前缀
        Object factoryBeanSelf = applicationContext.getBean("&myFactoryBean");
        System.out.println(factoryBeanSelf.getClass());
    }

}