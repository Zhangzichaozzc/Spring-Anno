package com.customer.spring.annotation.importanno;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.customer.spring.annotation.components.importselector.importbeandefinitionregistrar.Orange;

/**
 * MyImportBeanDefinationRegistrar
 *
 * @author Zichao Zhang
 * @date 2021/3/6
 */
public class MyImportBeanDefinationRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean containRed = registry.containsBeanDefinition("com.customer.spring.annotation.components" +
                ".importselector.Red");
        boolean containYellow = registry.containsBeanDefinition("com.customer.spring.annotation.components" +
                ".importselector.Yellow");
        if (containRed && containYellow) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Orange.class);
//            beanDefinition.setBeanClass(Orange.class);
//            beanDefinition.setBeanClassName("orange");
            registry.registerBeanDefinition("orange", beanDefinition);
        }
    }

}
