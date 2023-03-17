package Day20;

import java.util.Scanner;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) throws DevidedByZeroException, ArithmeticException{
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = sc.nextInt();
		try {
			if (b == 0) {
				throw new DevidedByZeroException();
			}
			System.out.println(a / b);
		} catch (ArithmeticException e) {

			System.out.println("devide by zeo");
		} catch (DevidedByZeroException e) {
			
		} finally {
			System.out.println("end");
			sc.close();
		}

	}

}