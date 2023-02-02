package Day8;
// this is the code to find number of digits in a given number
public class Number {

	public int numbers(int number) {
		String str = Integer.toString(number);
		char[] ch = str.toCharArray();
		return ch.length;

	}

	public int numbers1(int num) {
		int i = 0;
		while (num > 0) {
			num = num / 10;
			++i;
			
		}
		return i;
	}

	public static void main(String[] args) {
		Number num = new Number();
		System.out.println(num.numbers(123456));
		System.out.println(num.numbers1(123456));
	}

}
