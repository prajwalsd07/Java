package Day1;

import java.util.Scanner;

public class StringReverse {
	public StringBuilder reverse(String s) {
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		return s1.reverse();

	}

	public String reverse2(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str + s.charAt(i);

		}
		return str;
	}
	
	public String reverse3(String s) {
		String str="";
		char[] st = s.toCharArray();
		for (int i = st.length - 1; i >= 0; i--) {
			str = str + s.charAt(i);

		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringReverse a = new StringReverse();
		System.out.println(a.reverse(s));
		System.out.println(a.reverse2(s));
		System.out.println(a.reverse3(s));
		sc.close();

	}

}
