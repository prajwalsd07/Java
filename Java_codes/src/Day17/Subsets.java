package Day17;

import java.util.Arrays;

public class Subsets {
	void subset(String str)

	{
		int temp = 0;
		String[] s = new String[(str.length() * (str.length() + 1)) / 2];

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				s[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		Subsets sub = new Subsets();
		sub.subset("fun");
	}

}
