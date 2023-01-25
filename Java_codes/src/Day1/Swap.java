package Day1;

import java.util.Scanner;

public class Swap {
public void swapping(int a , int b)
{
	b=b+a;
	a=b-a;
	b=b-a;
	System.out.println("a -"+a+"B -"+ b);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Swap sw = new Swap();
		sw.swapping(a, b);
	}

}
