package Day22;

@FunctionalInterface
interface student {

	void getdetails(int a,String b);
}

public class AnyonomousClass {

	public static void main(String[] args) {
		student stu = (a,b) -> System.out.println(a + " " + b);

		stu.getdetails(5,"10");
	}

}
