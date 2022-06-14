package com.m2micro.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: 陈树洪
 * @Date: 2022/06/14/16:40
 * @Description:
 */
@Data
@ConfigurationProperties(prefix = "sms")
public class MsgProperties {


    private SmsMessage aliMsg= new SmsMessage();
    private SmsMessage txMsg = new SmsMessage();
    @Data
    public static class SmsMessage {
        private String password;

        private String name;

        @Override
        public String toString() {
            return "SmsMessage{" +
                    "password='" + password + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
