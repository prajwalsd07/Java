package Day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Frequency {
	

	void freq(int[] a) {
		Set<Integer> hash_Set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hash_Set.add(a[i]);
		}
		List<Integer> list = new ArrayList<Integer>(hash_Set);
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == list.get(i)) {
					count++;
				}
			}
			System.out.println(list.get(i)+"-ccc-"+count);
		}

	}

	public static void main(String[] args) {
		Frequency freq = new Frequency();
		int[] a = { 1, 2, 2, 3, 1, 5, 2 };
		freq.freq(a);
	}

}