package com.customer.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.customer.spring.annotation.components.Person;
import com.customer.spring.annotation.service.UserService;
import com.customer.spring.annotation.typeFilter.MyTypeFilter;

/**
 * BaseConfig
 *
 * @author Zichao Zhang
 * @date 2021/2/28
 */
@Configuration
/*// 排除 springmvc 子容器中配置
@ComponentScan(value = "com.customer.spring.annotation",
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        value = Controller.class
                )
        }
)*/
/*// 包含 springmvc 父容器中配置
@ComponentScan(
        value = "com.customer.spring.annotation",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {Service.class, Repository.class}
                )
        }
)*/

/*// 使用 FilterType.ASSIGNABLE_TYPE 的方式来注册指定bean
@ComponentScan(
        value = "com.customer.spring.annotation",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        value = {
                                UserService.class
                        }
                )
        }
)*/

// 自己实现自定义的 TypeFilter, 即使用 FilterType.CUSTOM 的方式来扫描bean
@ComponentScan(
        value = "com.customer.spring.annotation",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.CUSTOM,
                        classes = MyTypeFilter.class
                )
        }
)
public class BaseConfig {

    @Bean(name = {"person", "good", "morning"})
    public Person person() {
        return new Person();
    }

}
