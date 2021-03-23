package com.yaoyili.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "producer", fallback = DemoBreaker.class)
public interface OuterService {

    @GetMapping(value = "/hjb/producer/s2")
    String service1(@RequestParam(value = "param") String param);
}
