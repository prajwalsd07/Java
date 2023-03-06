package com.demo.Day13.templatemethod;

public abstract class Game {

	public abstract void initGame();
	public abstract void start();
	public abstract void end();
	
	
	//Template method
	/**
	 * Define the method play ( Algorithm)
	 * Differ the methods in subclasses
	 * subclass methods doesn't effect this algorithm
	 */
	public final void play()
	{
		initGame();
		start();
		end();
	}
}
class Mario extends Game
{

	@Override
	public void initGame() {
		System.out.println("Mario Loading");
		
	}

	@Override
	public void start() {
		System.out.println("Mario Starting");
		
	}

	@Override
	public void end() {
		System.out.println("Mario Ended");
		
	}
}
class PubG extends Game
{
	@Override
	public void initGame() {
		System.out.println("PubG Loading");
		
	}

	@Override
	public void start() {
		System.out.println("PubG Starting");
		
	}

	@Override
	public void end() {
		System.out.println("PubG Ended");
		
	}
}