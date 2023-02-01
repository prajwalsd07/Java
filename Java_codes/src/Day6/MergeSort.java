package Day6;

import java.util.Arrays;

public class MergeSort {

	public void mSort(int[] arr, int i, int j) {
		if (i < j) {
			int mid = (i + j) / 2;
			mSort(arr, i, mid);
			mSort(arr, mid + 1, j);
			merge(arr, i, mid, j);
		}
	}
 
	private void merge(int[] arr, int l, int mid, int h) {
		int i = l;
		int k = l;
		int j = mid + 1;
		int[] b = new int[arr.length];

		while (i <= mid && j <= h) {
			if (arr[i] < arr[j]) {
				b[k] = arr[i];
				i++;
				k++;
			} else {
				b[k] = arr[j];
				j++;
				k++;
			}

		}
		while (i <= mid) {
			b[k] = arr[i];
			i++;
			k++;
		}
		while (j <= h) {
			b[k] = arr[j];
			k++;
			j++;
		}
		
		
		
		for (i = l; i <= h; i++) {
			
			arr[i] = b[i];
		}
	}

	public static void main(String[] args) {
		MergeSort merge = new MergeSort();
		int[] arr = {6, 2, 8, 1, 4, 9 };
		merge.mSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
