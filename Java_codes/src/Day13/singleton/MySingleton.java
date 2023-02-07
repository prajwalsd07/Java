  package com.demo.singleton;

public class MySingleton {

	private static MySingleton singleton;
	
	private MySingleton() {
		System.out.println("Singleton object initialized...");
	}
	
	public static MySingleton instance()
	{
		if(singleton==null)
		{
			singleton = new MySingleton();
			return singleton;
		}
		else {
			return singleton;
		}
	}
} 
