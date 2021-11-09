package com.atguigu.boot.config;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.bean.pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mars
 * @create 2021-11-03 20:30
 * proxyBeanMethods = true默认为开启bean代理模式
 */
@Configuration(proxyBeanMethods = false)//这是一个配置类
public class MyConfig {
    @Bean//添加组件，方法名为组件id，返回类型为组件类型。返回的是组件中的实例
    public User user01(){
        User user = new User("小明");
        user.setPet(this.pet01());
        return user;
    }
    @Bean
    public pet pet01(){
        return new pet();
    }
}
