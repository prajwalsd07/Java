package Day4;

import java.util.Arrays;

public class SortArray {
public int[] sort(int[] arr)
{
	Arrays.sort(arr);
	return arr;
}
	public static void main(String[] args) {
		SortArray arr = new SortArray();
		int ar[]= {10,20,19,1,4,2,8,33};
		System.out.println(ar);
		System.out.println(Arrays.toString(arr.sort(ar)));

	}

}
