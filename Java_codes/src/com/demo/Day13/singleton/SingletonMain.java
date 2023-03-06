package com.demo.Day13.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		MySingleton mySingleton1 = MySingleton.instance();
		MySingleton mySingleton2 = MySingleton.instance();
		System.out.println(mySingleton1==mySingleton2);
	}
}
