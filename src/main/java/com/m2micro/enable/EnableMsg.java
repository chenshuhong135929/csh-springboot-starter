package com.m2micro.enable;

import com.m2micro.config.MsgAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: 陈树洪
 * @Date: 2022/06/14/17:02
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MsgAutoConfiguration.class})
public @interface EnableMsg {

}
