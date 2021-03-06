package com.customer.spring.annotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * WindowsCondition
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
public class WindowsCondition implements Condition {


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        BeanDefinitionRegistry registry = context.getRegistry();
        System.out.println("registry.getBeanDefinitionCount() = " + registry.getBeanDefinitionCount());
        ResourceLoader resourceLoader = context.getResourceLoader();
        ClassLoader classLoader = context.getClassLoader();
        Environment environment = context.getEnvironment();
        if (environment.getProperty("os.name").startsWith("Windows")) {
            return true;
        }
        return false;
    }
}
