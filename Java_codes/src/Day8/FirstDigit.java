package Day8;

public class FirstDigit {

	public int firstDigit(int num) {
		while(num/10!=0)
		{
			num=num/10;
		}
	
	return num;
	}

	
	public int firstDigit1(int num) {
		double a = Math.log(num);
		int b = (int)a;
		double c = Math.pow(num, b);
		
		
	
	return (int)c;
	}


	public static void main(String[] args) {
FirstDigit first =new FirstDigit();
System.out.println(first.firstDigit(9746));
System.out.println(first.firstDigit(9746));
	}

}
