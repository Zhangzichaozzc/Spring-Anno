package com.customer.spring.annotation.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.customer.spring.annotation.components.Person;

/**
 * MainConfig
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
@Configuration
public class MainConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person person() {
        System.out.println("向IOC容器中添加Bean");
        return new Person();
    }

}
