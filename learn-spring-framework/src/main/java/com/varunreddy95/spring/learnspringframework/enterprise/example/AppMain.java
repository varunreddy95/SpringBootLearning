package com.varunreddy95.spring.learnspringframework.enterprise.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.varunreddy95.spring.learnspringframework.enterprise.example.web.MyWebController;

@Configuration
@ComponentScan("com.varunreddy95.spring.learnspringframework.enterprise.example.web")
@ComponentScan("com.varunreddy95.spring.learnspringframework.enterprise.example.business")
@ComponentScan("com.varunreddy95.spring.learnspringframework.enterprise.example.data")
public class AppMain {
    public static void main(String[] args) {
        
        try (var context = new AnnotationConfigApplicationContext(AppMain.class)) {
            
            System.out.println(context.getBean(MyWebController.class).
                                returnValueFromBusinessService());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
