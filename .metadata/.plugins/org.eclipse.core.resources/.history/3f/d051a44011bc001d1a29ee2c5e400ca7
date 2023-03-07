package Day16;

import java.util.Arrays;

public class SecondLarge {
	int second(int[] a) {
		Arrays.sort(a);
		
		for (int i = 0; i < a.length - 1; i++) {
			if (a[a.length - 1 - i] != a[a.length - 2 - i]) {
				
				return a[a.length - 2 - i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		SecondLarge sec = new SecondLarge();
		int a[] = { 3, 2, 3, 4, 5, 5, 5 };
		System.out.println(sec.second(a));

	}

}
