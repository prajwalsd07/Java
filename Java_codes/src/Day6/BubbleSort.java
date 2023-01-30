package Day6;

import java.util.Arrays;

public class BubbleSort {

	public void sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 2, 9 };
		BubbleSort bub = new BubbleSort();
		bub.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
