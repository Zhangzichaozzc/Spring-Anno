package com.customer.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.customer.spring.annotation.components.factorybean.MyFactoryBean;

/**
 * FactoryBeanConfig
 *
 * @author Zichao Zhang
 * @date 2021/3/7
 */
@Configuration
public class FactoryBeanConfig {

    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }

}
