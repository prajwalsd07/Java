package Day17;

import java.util.Arrays;

public class Anagram {
	boolean anagram(String s1, String s2) {
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);

		s1 = String.valueOf(ch);
		s2 = String.valueOf(ch2);

		if(s1.equals(s2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println(a.anagram("suraj", "rajsu"));
	}

}
