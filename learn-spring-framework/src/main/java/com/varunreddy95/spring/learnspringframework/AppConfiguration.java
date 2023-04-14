package com.varunreddy95.spring.learnspringframework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//Record creates setter, getter, toString for a class, even the the constructor
record Person (String name, int age) { };


@Configuration
public class AppConfiguration {
    //Here you can define Spring beans to be managed.

    //@Bean creates a Spring Bean

    @Bean(name= "My Name")
    public String name() {
        return "Varun";
    }

    @Bean
    public Person person() {
        return new Person("Varun", 27);
    }

}
