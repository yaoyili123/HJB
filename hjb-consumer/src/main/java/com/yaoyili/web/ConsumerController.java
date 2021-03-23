package com.yaoyili.web;

import com.yaoyili.services.InnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsumerController {

    @Autowired
    InnerService innerService;

    @GetMapping(value = "/hjb/consumer/s1")
    String demo1(
            @RequestParam(value = "name", required = true) String name) {
        return innerService.service1(name);
    }

}
