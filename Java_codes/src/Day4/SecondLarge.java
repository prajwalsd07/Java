package Day4;

import java.util.Arrays;

public class SecondLarge {
	int second(int a[]) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = a.length - 1; i > 2; i--) {
			if (a[i] != a[i - 1]) {
				return a[i - 1];
			}
		}
		return 0;
	}

	int second2(int a[]) {
		int sec, lar;
		if (a[1] > a[2]) {
			lar = a[0];
			sec = a[1];

		} else {
			lar = a[1];
			sec = a[0];
		}
		for (int i = 2; i < a.length; i++) {
			if (a[i] > lar) {
				sec = lar;
				lar = a[i];
			} else if ((a[i] > sec) && (a[i] != lar)) {
				sec = a[i];
			}
		}
		return sec;
	}

	public static void main(String[] args) {

		SecondLarge sec = new SecondLarge();
		int arr[] = { 1, 2, 4, 5, 7, 7 };
		System.out.println(sec.second2(arr));
	}

}
