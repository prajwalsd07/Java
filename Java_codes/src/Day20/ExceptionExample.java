package Day20;

import java.util.Scanner;

class A {
	void devide(int a, int b) throws DevidedByZeroException {
		if (b == 0) {
			throw new DevidedByZeroException();
		}
	}

}

class B {
	B(int x, int y) {
		A a = new A();
		try {
			a.devide(x, y);
		} catch (DevidedByZeroException e) {
			System.out.println("user defined exception handled");
		} finally {
			System.out.println("end");

		}

	}
}

public class ExceptionExample {
	public static void main(String[] args) throws DevidedByZeroException, ArithmeticException {
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = sc.nextInt();
		B v = new B(a, b);

	}

}
