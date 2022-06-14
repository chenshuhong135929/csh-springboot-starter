package com.m2micro.test;

import com.m2micro.enable.EnableMsg;
import com.m2micro.example.AliMsg;
import com.m2micro.example.TxMsg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: 陈树洪
 * @Date: 2022/06/14/17:05
 * @Description:
 */
@SpringBootApplication
@EnableMsg
public class TestStarter {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TestStarter.class, args);
        AliMsg aliyunSmsSender = applicationContext.getBean(AliMsg.class);
        aliyunSmsSender.send("用阿里云发送短信");
        TxMsg tencentSmsSender = applicationContext.getBean(TxMsg.class);
        tencentSmsSender.send("用腾讯云发送短信");
    }

}
