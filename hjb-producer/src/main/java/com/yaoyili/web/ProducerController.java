package com.yaoyili.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

    @GetMapping(value = "/hjb/producer/s2")
    String s2(
            @RequestParam(value = "param", required = true) String name) {
        return name + "是个傻逼";
    }
}
