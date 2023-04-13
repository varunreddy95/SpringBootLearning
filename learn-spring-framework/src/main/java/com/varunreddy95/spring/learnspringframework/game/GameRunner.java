package com.varunreddy95.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//private MarioGame game;
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}