package com.demo.Day13.templatemethod;

public class TemplateMain {

	public static void main(String[] args) {
		Game game = new PubG();//implicit Type-cast
		//superclass reference to subclass object
		game.play();
		
		game = new Mario();
		game.play();
	}
}
