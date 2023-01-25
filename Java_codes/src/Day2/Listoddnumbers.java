package Day2;

import java.util.ArrayList;
import java.util.List;

public class Listoddnumbers {
	public int odd(List<Integer> list) {
		int count = 0;
		for (Integer i : list) {
			if (i % 2 != 0) {
				count = count + 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Listoddnumbers list = new Listoddnumbers();
		List<Integer> list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5); 
		list1.add(6);
		list1.add(7);
		System.out.println(list1);
		System.out.println(list.odd(list1));
	}

}
