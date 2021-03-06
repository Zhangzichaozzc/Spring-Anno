package com.customer.spring.annotation.components.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * MyFactoryBean
 *
 * @author Zichao Zhang
 * @date 2021/3/7
 */
public class MyFactoryBean implements FactoryBean<Elephant> {
    @Override
    public Elephant getObject() throws Exception {
        System.out.println("MyFactoryBean.getObject");
        return new Elephant();
    }

    @Override
    public Class<?> getObjectType() {
        return Elephant.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
