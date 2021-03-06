package com.customer.spring.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.customer.spring.annotation.components.OperatingSystem;
import com.customer.spring.annotation.condition.LinuxCondition;
import com.customer.spring.annotation.condition.WindowsCondition;

/**
 * ConditionConfig
 *
 * @author Zichao Zhang
 * @date 2021/3/5
 */
@Configuration
public class ConditionalConfig {

    @Autowired
    private Environment environment;

    @Bean
    @Conditional(LinuxCondition.class)
    public OperatingSystem linux() {
        OperatingSystem os = new OperatingSystem();
        os.setName(environment.getProperty("os.name"));
        return os;
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public OperatingSystem windows() {
        OperatingSystem os = new OperatingSystem();
        os.setName(environment.getProperty("os.name"));
        return os;
    }

}
