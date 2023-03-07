package Day16;

public class PerfectSquare {
	public boolean perfectsquare(int a) {
		for (int i = 1; i * i <= a; i++) {
			if (a / i == i && a % i == 0) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		PerfectSquare perfect = new PerfectSquare();
		System.out.println(perfect.perfectsquare(25));
	}

}
