package Day19;

abstract class car {
	public abstract String speed(int n);

	public String size() {
		return "6 meter";
	}

}

class honda extends car {

	@Override
	public String speed(int n) {

		return (n > 60) ? "fast" : "safe";
	}

}

public class AbstractClass {

	public static void main(String[] args) {

		car c = new car() {

			@Override
			public String speed(int n) {

				return "i am new anyonymous";
			}
		};
		System.out.println(c.speed(20));

		car c1 = new honda();
		System.out.println(c1.speed(20));

		// AbstractClass c = new AbstractClass();
		// c.

	}

}
