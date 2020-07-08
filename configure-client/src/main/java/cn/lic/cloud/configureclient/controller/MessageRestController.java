package cn.lic.cloud.configureclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author licong
 * @version 1.0
 * @date 2020/7/3 16:04
 */
@RestController
@RefreshScope
public class MessageRestController {
    @Value("${message:Hello default}")
    private String message;

    @Value("${hello}")
    private String hello;

    @RequestMapping("/message")
    public String renderMessage(){
        return message;
    }

    @RequestMapping("/hello")
    public String hello(){
        return hello;
    }
}
