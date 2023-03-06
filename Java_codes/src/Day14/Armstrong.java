package Day6;

public class Armstrong {
	public boolean armstrong(int num) {
		String str = Integer.toString(num);
		int orig = num;
		double b = 0;
		while (num > 0) {
			int a = num % 10;
			num = num / 10;
			b = Math.pow(a, str.length()) + b;
		}
		if (orig == b) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Armstrong arm = new Armstrong();
		System.out.println(arm.armstrong(1634));
	}

}
