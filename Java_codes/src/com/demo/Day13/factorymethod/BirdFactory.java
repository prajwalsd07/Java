package com.demo.Day13.factorymethod;

public class BirdFactory {

	public static Bird getYourBird(String birdName)
	{
		if(birdName.equals("Parrot"))
		{
			return new Parrot();
		}
		else if(birdName.equals("Crow"))
		{
			return new Crow();
		}
		else if(birdName.equals("Eagle"))
		{
			return new Eagle();
		}
		else if(birdName.equals("Sparrow"))
		{
			return new Sparrow();
		}
		else {
			throw new RuntimeException("The bird you asked is not there in the factory....!");
		}
	}
}
