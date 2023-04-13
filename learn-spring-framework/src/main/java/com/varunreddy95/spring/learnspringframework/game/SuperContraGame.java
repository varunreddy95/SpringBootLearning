package com.varunreddy95.spring.learnspringframework.game;

public class SuperContraGame implements GamingConsole{
	
	@Override
	public void up() {
		System.out.println("Super Contra Game Up");
	}
	
	@Override
	public void down() {
		System.out.println("Super Contra Game Down");
	}
	
	@Override
	public void left() {
		System.out.println("Super Contra Game Left");
	}
	
	@Override
	public void right() {
		System.out.println("Super Contra Game Right");
	}
}
