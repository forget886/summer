package com.xinwu.config;

import com.xinwu.bean.Computer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 张辉
 * @create: 2019-07-15
 **/
@Configuration
public class StudentConfig {


    @Bean
    @Conditional(ComputerCondition.class)
    public Computer computer1(){
        return new Computer("mac");
    }

    @Bean
    @ConditionalOnMissingBean(Computer.class)
    public Computer computer2(){
        return new Computer("lenovo");
    }

}
