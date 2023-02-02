package Day1;

public class Fibinoccie {

	public void fibinoc(int num) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 0; i < num; i++) {
			System.out.println(a + " ");
			a = b;
			b = c;
			c = c + b;

		}

	}

	public int fibinocRecursion(int num) {
		if (num <= 1) {
			return num;

		}
		return fibinocRecursion(num - 1) + fibinocRecursion(num - 2);
	}

	public static void main(String[] args) {
		Fibinoccie fib = new Fibinoccie();
		fib.fibinoc(10);

		for (int i = 0; i < 10; i++) {
			System.out.println(fib.fibinocRecursion(i));
		}

	}

}
