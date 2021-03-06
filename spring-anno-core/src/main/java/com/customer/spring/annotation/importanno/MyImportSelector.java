package com.customer.spring.annotation.importanno;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyImportSelector
 *
 * @author Zichao Zhang
 * @date 2021/3/6
 */
public class MyImportSelector implements ImportSelector, BeanClassLoaderAware {

    private ClassLoader classLoader = null;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(importingClassMetadata + "-------------");
        System.out.println("importingClassMetadata.getClassName() = " + importingClassMetadata.getClassName());

        return new String[]{"com.customer.spring.annotation.components.importselector.Blue",
                "com.customer.spring.annotation.components.importselector.Red",
                "com.customer.spring.annotation.components.importselector.Yellow"};

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
