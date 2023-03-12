package Day21;

import java.util.ArrayList;
import java.util.*;

class Student {
	int roll;
	String name;

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}

public class ComparatorExample2 {

	public static void main(String[] args) {

		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.roll > o2.roll) {
					return 1;
				} else
					return -1;
			}
		};
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
