package com.demo.factorymethod;

import java.util.Scanner;

public class BairMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Bird - Factory\n"
				+"We have Parrot, Crow, Eagle & Sparrow...\n"
				+"================================================\n"
				+ "Enter the Bird name you wanna buy.....:)");
		String nameOfBird = scanner.next();
		
		Bird bird = BirdFactory.getYourBird(nameOfBird);
		
		System.out.println(bird.getBirdDetails());
		scanner.close();
	}
}
