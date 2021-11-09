package com.atguigu.boot;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.bean.pet;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类@SpringBootApplication
 * @author mars
 * @create 2021-11-02 18:04
 */
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        User user01 = run.getBean("user01", User.class);
        User user02 = run.getBean("user01", User.class);
        System.out.println(user01 == user02);

        MyConfig bean = run.getBean(MyConfig.class);
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user1 == user);
        User user03 = run.getBean("user01", User.class);
        pet user04 = run.getBean("pet01", pet.class);
        //System.out.println(user03.getPet() == user04);
    }
}
