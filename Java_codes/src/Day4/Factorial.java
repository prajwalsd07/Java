package Day4;

public class Factorial {
	int fact(int num) {
		int j = 1;
		for (int i = num; i > 0; i--) {
			j = i * j;

		}
		return j;
	}

	int fact2(int num) // .........RECURSION METHOD
	{
		if ((num == 1) || (num == 0)) {
			return 1;
		} else {
			return (num * fact2(num - 1));
		}
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.fact2(3));

	}

}
