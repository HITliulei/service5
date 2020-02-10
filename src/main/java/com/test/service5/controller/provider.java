package com.test.service5.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lei
 * @Date 2020/2/9 19:36
 * @Version 1.0
 */
@RestController
@RequestMapping("/provider")
public class provider {

    @Value("${eureka.instance.metadata-map.version}")
    private String version;

    @GetMapping("/getServiceInfo")
    public String getVersion(){
        return this.version;
    }

    @GetMapping("/version")
    public String getVer(){
        return "v1.1.0";
    }

}
