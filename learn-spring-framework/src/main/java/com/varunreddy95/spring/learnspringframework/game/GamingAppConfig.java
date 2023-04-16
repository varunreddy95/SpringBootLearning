package com.varunreddy95.spring.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GamingAppConfig {

    @Bean
    // GamingConsole g = new PacManGame()
    public GamingConsole game() {
        return new PacManGame();
    }
    
    @Bean
    public GameRunner gameRunner() {
        return new GameRunner(game());
    }
}
