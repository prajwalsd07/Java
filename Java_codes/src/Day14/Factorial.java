package Day6;

public class Factorial {

	public void factorial(int num)

	{
		int fnum = 1;
		for (int i = num; i > 0; i--) {
			fnum = i * fnum;

		}
		System.out.println(fnum);
	}
	
	public int factorialRecursion(int num)
	{
		if(num==1 || num==0)
		{
			return 1;
		}
		return num*(factorialRecursion(num-1));
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		fact.factorial(0);
		System.out.println(fact.factorialRecursion(4));
	}

}
