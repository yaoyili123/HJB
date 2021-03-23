package com.yaoyili.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InnerServiceImpl implements InnerService {

    @Autowired
    OuterService outerServices;

    @Override
    public String service1(String param) {
        return outerServices.service1(param);
    }
}
