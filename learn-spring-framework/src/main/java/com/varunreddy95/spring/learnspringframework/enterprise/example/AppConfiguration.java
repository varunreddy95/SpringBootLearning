package com.varunreddy95.spring.learnspringframework.enterprise.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.varunreddy95.spring.learnspringframework.enterprise.example.business.BusinessService;
import com.varunreddy95.spring.learnspringframework.enterprise.example.data.DataService;
import com.varunreddy95.spring.learnspringframework.enterprise.example.web.MyWebController;


@Configuration
public class AppConfiguration {


    @Bean
    public DataService dataService() {
        return new DataService();
    }


    @Bean
    public BusinessService businessService() {
        return new BusinessService(dataService());
    }
    

    @Bean
    public MyWebController webController() {
        return new MyWebController(businessService());
    }
}
