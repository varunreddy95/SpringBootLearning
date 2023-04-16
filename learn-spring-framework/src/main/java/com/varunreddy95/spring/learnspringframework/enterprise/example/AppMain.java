package com.varunreddy95.spring.learnspringframework.enterprise.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varunreddy95.spring.learnspringframework.enterprise.example.web.MyWebController;

public class AppMain {
    public static void main(String[] args) {
        
        try (var context = new AnnotationConfigApplicationContext(AppConfiguration.class)) {
            
            System.out.println(context.getBean(MyWebController.class).
                                returnValueFromBusinessService());
            


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
