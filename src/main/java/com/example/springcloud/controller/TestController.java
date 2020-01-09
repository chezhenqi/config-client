package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chezhenqi
 * @program config
 * @description 测试动态刷新config
 * @date 2020-01-07 15:34
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/getConfig")
    public String getProfile() {
        return "读取到配置中心：" + profile;
    }
}



