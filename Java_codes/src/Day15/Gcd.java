package Day7;

public class Gcd {
	public int gcd(int a, int b) {
		int c = (a > b) ? b : a;

		for (int i = c; i > 0; i--) {

			if ((a % i == 0) && (b % i == 0)) {

				return i;
			}
		}
		return 1;

	}

	public static void main(String[] args) {
		Gcd g = new Gcd();
		System.out.println(g.gcd(18, 36));
	}

}
