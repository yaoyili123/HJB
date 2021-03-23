package com.yaoyili.services;

import org.springframework.stereotype.Component;

@Component
public class DemoBreaker implements OuterService{

    @Override
    public String service1(String param) {
        return "调用失败";
    }
}
