package com.varunreddy95.spring.learnspringframework.enterprise.example.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.varunreddy95.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
@Primary
public class MyWebController {

    @Autowired
    private BusinessService businessService;

    public MyWebController(BusinessService businessService) {
        System.out.println("Constructor Injection");
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

