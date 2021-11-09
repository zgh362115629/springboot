package com.atguigu.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主程序类@SpringBootApplication
 * @author mars
 * @create 2021-11-02 17:57
 */

@RestController
public class HelloWord {
    @RequestMapping("/hello")
    public String handle01(){
        return "hello word!你好啊";
    }
}
