package Day1;
public class prime {
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

		prime pr = new prime();
		int a = 3;
		System.out.println(pr.prim(a));
	}
}
