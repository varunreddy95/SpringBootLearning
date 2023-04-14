package com.varunreddy95.spring.learnspringframework.enterprise.example.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.varunreddy95.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {

    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

