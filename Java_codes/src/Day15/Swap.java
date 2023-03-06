package Day7;

public class Swap {
public void swap(int a,int b)
{
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
}
	public static void main(String[] args) {
		Swap s = new Swap();
		s.swap(10, 20);

	}

}
