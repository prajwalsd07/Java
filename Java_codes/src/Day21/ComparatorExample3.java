package Day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorExample3 {

	public static void main(String[] args) {

		Comparator<Student> comp = (o1,o2) ->  (o1.roll > o2.roll)?1:-1;


			
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student(1, "suraj"));
		list1.add(new Student(6, "suraj"));
		list1.add(new Student(4, "suraj"));
		list1.add(new Student(2, "suraj"));
		list1.add(new Student(5, "suraj"));
		list1.add(new Student(9, "suraj"));

		Collections.sort(list1, comp);

		System.out.println(list1);
	}

}