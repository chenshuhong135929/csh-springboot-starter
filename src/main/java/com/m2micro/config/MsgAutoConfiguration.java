package com.m2micro.config;


import com.m2micro.example.AliMsg;
import com.m2micro.example.TxMsg;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 陈树洪
 * @Date: 2022/06/14/16:51
 * @Description:
 */
@EnableConfigurationProperties(value = MsgProperties.class)
@Configuration
public class MsgAutoConfiguration {

    @Bean
    public AliMsg aliMsg(MsgProperties  msgProperties){
      return  new AliMsg(msgProperties.getAliMsg());
    }


    @Bean
    public TxMsg txMsg(MsgProperties  msgProperties){
        return  new TxMsg(msgProperties.getTxMsg());
    }
}
