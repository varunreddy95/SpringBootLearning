package com.varunreddy95.spring.learnspringframework.game;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GamingApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppConfig.class)) {
            
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
