package Day20;
import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = sc.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {

			System.out.println("devide by zeo");
		} finally {
			System.out.println("end");
			sc.close();
		}

	}

}
