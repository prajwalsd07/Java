package Day19;

interface cars 
{
	public String speed(int n);
	default String size(int a)
	{
		return "6 meter";
	}
	
}

class hero implements cars {

	@Override
	public String speed(int n) {

		return (n > 60) ? "fast" : "safe";
	}

}
public class InterfaceExample {

	public static void main(String[] args) {
		cars c1 = new hero();
		hero h = new hero();
		System.out.println(c1.size(2));
		System.out.println(c1.speed(20));
		
		System.out.println(h.size(2));
		System.out.println(h.speed(20));

	}

}
