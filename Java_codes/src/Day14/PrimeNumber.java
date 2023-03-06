package Day6;

public class PrimeNumber {
	public boolean prim(int num) {
		if (num == 0 || num == 1) {
			return false;

		}
		if (num == 2) {
			return true;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		PrimeNumber prim = new PrimeNumber();
		System.out.println(prim.prim(0));

	}

}
