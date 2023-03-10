package Day19;

class A {

	int speed;
	int size;
	
	A(int speed)
	{
		System.out.println(speed);
	}

	int show(int n) {
		int a = n + 10;
		return a;
	}

	String show2(String s) {
		String a = s + "this is class A";
		return a;
	}
}

class B extends A {
	B(int speed,int size)
	{
		super(speed);
		this.size=size;
		
	}
	@Override
	int show(int n) {
		return n + 20;
		// return super.show(n);
	}

	@Override
	String show2(String s) {
		return s + "this is class B";
		// return super.show2(s);
	}

	boolean dark() {
		return false;
	}
}

class C extends B {

	C(int speed, int size) {
		super(speed, size);
		// TODO Auto-generated constructor stub
	}


}

public class InheritenceExample {

	public static void main(String[] args) {
		C c = new C(10, 20);
		System.out.println(c.show(3));
		System.out.println(c.show2("suraj"));
		System.out.println(c.dark());

	}

}
