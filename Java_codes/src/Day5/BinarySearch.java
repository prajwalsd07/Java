package Day5;

import java.util.Scanner;

public class BinarySearch {
	public int binary(int[] a, int ser) {
		int start = 0;
		int end = a.length - 1;
		int mid = (start + end) / 2;

		for (int i = 0; i < a.length / 2; i++) {
			if (a[mid] == ser) {
				return mid;
			} else if (ser < a[mid]) {
				end = mid;
				mid = (start + end) / 2;
			} else if (ser > a[mid]) {
				start = mid;
				mid = (start + end) / 2;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		BinarySearch bin = new BinarySearch();
		int[] a = {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		int ser = sc.nextInt();

		System.out.println(bin.binary(a, ser));
		sc.close();
	}
}