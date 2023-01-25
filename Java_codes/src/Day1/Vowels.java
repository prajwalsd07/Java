package Day1;

import java.util.Scanner;

public class Vowels {
	public int vowel(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] == 'A') || (ch[i] == 'a') || (ch[i] == 'e') || (ch[i] == 'E') || (ch[i] == 'o') || (ch[i] == 'O')
					|| (ch[i] == 'i') || (ch[i] == 'I') || (ch[i] == 'u') || (ch[i] == 'U')) {
				count = ++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			Vowels vow = new Vowels();
			System.out.println(vow.vowel(str));
		}

	}

}
