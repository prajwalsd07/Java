package Day6;

public class Fibinoccie {

	public void fibinoccie(int num) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a + " ");
		for (int i = 2; i < num; i++) {
			c = b + a;
			System.out.println(c + " ");
			a = b;
			b = c;

		}
	}

	public static void main(String[] args) {

		Fibinoccie fib = new Fibinoccie();
		fib.fibinoccie(8);
	}

}
