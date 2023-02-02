package Day8;

import java.util.Scanner;

public class GCD {

	public int gcd(int a, int b) {
		int n = a < b ? a : b; // Ternary operator
		for (int i = n ; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		GCD gc = new GCD();
		System.out.println(gc.gcd(a, b));

	}
}
