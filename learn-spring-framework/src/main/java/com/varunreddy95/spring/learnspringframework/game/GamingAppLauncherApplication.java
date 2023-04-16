package com.varunreddy95.spring.learnspringframework.game;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.varunreddy95.spring.learnspringframework.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

            context.getBean(GameRunner.class).run();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
