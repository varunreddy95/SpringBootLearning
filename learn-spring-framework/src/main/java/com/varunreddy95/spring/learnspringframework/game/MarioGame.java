package com.varunreddy95.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	
	@Override
	public void up() {
		System.out.println("Jump");
	}
	
	@Override
	public void down() {
		System.out.println("Down into a hole");
	}
	
	@Override
	public void left() {
		System.out.println("Stop");
	}
	
	@Override
	public void right() {
		System.out.println("Accelerate");
	}
}
