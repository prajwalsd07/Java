package Day8;

import java.util.Scanner;

public class LCM {

	public int lcm(int a, int b) {
		for (int i = 1; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
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

		LCM gc = new LCM();
		System.out.println(gc.lcm(a, b));

	}
}
