package com.varunreddy95.spring.learnspringframework.HelloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        
        //1. Launch a Spring Context

        try(AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfiguration.class)) {

                    //2. Configure the things that we want Spring to manage - @Configuration
        System.out.println(context.getBean("MyName"));
        System.out.println(context.getBean("person"));

        /*
         * We cannot really retreive a bean of Person class right now, because whenever we
         * call the getBean() method there are 3 beans associated with the Person class
         * they are person(), personMethodCall() & personParameterCall(). The default scope
         * of a spring bean is a singleton class, which means only one instance
         * 
         *         System.out.println(context.getBean(Person.class));
         */
        
        
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("personMethodCall"));
        System.out.println(context.getBean("personParameterCall"));


        // To get the list of all the Spring beans being managed
        System.out.println("\n Spring Bean names: \n");
        Arrays.stream(context.getBeanDefinitionNames()).
                            forEach(System.out::println);

        //To retreive multiple objects using same spring bean, matching multiple beans
        //Use primary to a specific bea
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));

        //Use a specific bean as a qualifier when there are multiple matching candidates
        System.out.println(context.getBean("personParameterCall"));
        } catch(Exception e) {System.out.println(e);}

    }
}
