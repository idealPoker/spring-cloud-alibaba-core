package com.lwq.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lingw
 */
@RestController
public class ProviderAdminController {

    @Value(value = "${server.port}")
    private String port;
    @GetMapping(value = "hi")
    public String test(){
        return "confirm "+port;
    }
}
