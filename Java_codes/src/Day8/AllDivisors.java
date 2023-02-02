package Day8;

public class AllDivisors {

	public void AllDivisors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
		
		public void AllDivisors1(int num) {
			for (int i = 1; i*i <=num; i++) {
				if (num % i == 0) {
					System.out.println(i);
					if(i!=num/i)   // for perfect squares like 25 --5 to avoid printing for 2 times
					{
						System.out.println(num/i);
					}
				}
			}

	}

	public static void main(String[] args) {
		int num = 100;
		AllDivisors d = new AllDivisors();
		d.AllDivisors(num);
		d.AllDivisors1(num);
	}

}
