package Day19;

class x {
	int a, b, c;
void show()
{System.out.println( a+b+c);
}
}

class y extends x {

	void show() {
		//super.show();
		a=5;
		b=5;
		c=5;
		System.out.println(a + b + c);
	}

}

public class Inheritence2 {

	public static void main(String[] args) {
		x x1 = new y();
		x1.show();

	}

}
