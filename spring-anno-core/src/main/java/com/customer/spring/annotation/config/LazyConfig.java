package com.customer.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.customer.spring.annotation.components.Animal;

/**
 * LazyConfig
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
@Configuration
public class LazyConfig {

    @Bean
    @Lazy
    public Animal animal() {
        System.out.println("向容器中添加AnimalBean");
        return new Animal();
    }

}
