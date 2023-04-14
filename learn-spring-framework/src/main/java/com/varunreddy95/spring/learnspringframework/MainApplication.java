package com.varunreddy95.spring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        
        //1. Launch a Spring Context

        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfiguration.class);


        //2. Configure the things that we want Spring to manage - @Configuration
        System.out.println(context.getBean("My Name"));
        System.out.println(context.getBean("person"));
        
    }
}
