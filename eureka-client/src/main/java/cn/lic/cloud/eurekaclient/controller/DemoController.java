package cn.lic.cloud.netflix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }
}
