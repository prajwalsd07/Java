package Day21;

import java.util.ArrayList;
import java.util.*;


public class ComparatorExample {

	public static void main(String[] args) {

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > o2 % 10) {
					return 1;
				} else
					return -1;
			}
		};
		List<Integer> list1 = new ArrayList<>();
		list1.add(81);
		list1.add(84);
		list1.add(89);
		list1.add(86);
		list1.add(87);
		list1.add(83);

		Collections.sort(list1, comp);

		System.out.println(list1);
	}

}
