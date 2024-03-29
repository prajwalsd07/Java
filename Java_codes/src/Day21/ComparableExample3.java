package Day21;

import java.util.ArrayList;
import java.util.*;

class Student1 implements Comparable<Student1> {
	int roll;
	String name;

	public Student1(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		if (roll > o.roll) {
			return 1;
		} else
			return -1;
	}

}

public class ComparableExample3 {

	public static void main(String[] args) {

		List<Student1> list1 = new ArrayList<>();
		list1.add(new Student1(1, "suraj"));
		list1.add(new Student1(6, "suraj"));
		list1.add(new Student1(4, "suraj"));
		list1.add(new Student1(2, "suraj"));
		list1.add(new Student1(5, "suraj"));
		list1.add(new Student1(9, "suraj"));

		Collections.sort(list1);

		System.out.println(list1);
	}

}
