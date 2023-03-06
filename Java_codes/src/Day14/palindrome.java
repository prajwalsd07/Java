package Day6;

import java.util.Scanner;

public class palindrome {
	public boolean palindrom(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < (ch.length / 2); i++) {
			if (ch[i] != ch[ch.length - 1 - i]) {

				return false;
			}
		}
		return true;

	}

	public boolean palindrom2(String str) {
		StringBuilder st = new StringBuilder(str);

		if (str.equals(st.reverse().toString())) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		palindrome pal = new palindrome();

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println(pal.palindrom(a));
		System.out.println(pal.palindrom2(a));

	}

}
