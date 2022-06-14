package com.m2micro.example;

import com.m2micro.config.MsgProperties;

/**
 * @Author: 陈树洪
 * @Date: 2022/06/14/16:50
 * @Description:
 */
public class TxMsg  implements Msg{

    private MsgProperties.SmsMessage smsMessage;

    public TxMsg(MsgProperties.SmsMessage smsMessage) {
        this.smsMessage = smsMessage;
    }

    @Override
    public boolean send(String msg) {
        System.out.println("腾讯发送信息："+smsMessage.toString()+msg);
        return true;
    }
}
