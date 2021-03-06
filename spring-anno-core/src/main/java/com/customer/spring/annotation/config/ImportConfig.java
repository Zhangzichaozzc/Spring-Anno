package com.customer.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.customer.spring.annotation.components.Wolf;
import com.customer.spring.annotation.components.importselector.importbeandefinitionregistrar.Orange;
import com.customer.spring.annotation.importanno.MyImportBeanDefinationRegistrar;
import com.customer.spring.annotation.importanno.MyImportSelector;

/**
 * ImportConfig
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
@Configuration
@Import({Wolf.class, ConditionalConfig.class, MyImportSelector.class, MyImportBeanDefinationRegistrar.class})
public class ImportConfig {


    @Bean
    public Orange orangeTwo() {
        Orange orange = new Orange();
        orange.setName("good");
        orange.setDesc("nice");
        return orange;
    }

}
