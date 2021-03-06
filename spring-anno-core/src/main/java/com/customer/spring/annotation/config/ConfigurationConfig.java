package com.customer.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.customer.spring.annotation.components.Cat;

/**
 * ConfigurationConfig
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
@Configuration
public class ConfigurationConfig {

    private Environment environment;

    public ConfigurationConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName(environment.getProperty("os.name"));
        return cat;
    }

}
