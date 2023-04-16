package com.varunreddy95.spring.learnspringframework.HelloWorld;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


//Record creates setter, getter, toString for a class, even the the constructor
record Person (String name, int age, Address address) { };
record Address (String firsLine, String secondLine){};


@Configuration
public class AppConfiguration {
    //Here you can define Spring beans to be managed.

    //@Bean creates a Spring Bean

    @Bean(name= "MyName")
    public String name() {
        return "Varun";
    }

    @Bean
    public Person person() {
        return new Person("Varun", 27, new Address("Baker Street", "London"));
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    @Primary
    @Qualifier("address2Qualifier")
    public Address address2() {
        return new Address("Hauphtbannof", "Frankfurt");
    }


    @Bean
    @Primary
    public Person personMethodCall() {
        System.out.println("This is a person method call");
        return new Person(name(), age(), address());
    }

    @Bean
    public Person personParameterCall(String MyName, int age, @Qualifier("address2Qualifier") Address address) {
        System.out.println("This is a parameter call: ");
        return new Person(MyName, age, address);
    }

}
