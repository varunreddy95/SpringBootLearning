package com.varunreddy95.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.varunreddy95.spring.learnspringframework.enterprise.example.data.DataService; 

@Component
public class BusinessService {

    @Autowired
    private DataService dataService;

    @SuppressWarnings("null")
    public long calculateSum() {
        List<Integer> data =  dataService.getData();
        if(!data.isEmpty()) {
            return data.stream().reduce(Integer::sum).get();
        }
        else{
            return 0;
        }
    }
}

