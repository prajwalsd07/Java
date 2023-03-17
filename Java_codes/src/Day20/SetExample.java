package Day20;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		for (int i = 20; i > 0; i--) {
			set1.add(i);
		}
		set1.add(0);
		System.out.println(set1);
		set1.remove(Integer.valueOf(5));
		set1.remove(3);
		System.out.println(set1);
		System.out.println(set1.contains(2));
		System.out.println(set1.isEmpty());
		System.out.println(set1.size());
		set1.clear();
		System.out.println(set1);

		Set<Integer> s2 = new LinkedHashSet<>();
		for (int i = 20; i > 0; i--) {
			s2.add(i);
		}

		System.out.println(s2);
		s2.remove(Integer.valueOf(5));
		s2.remove(3);
		System.out.println(s2);
		System.out.println(s2.contains(2));
		System.out.println(s2.isEmpty());
		System.out.println(s2.size());
		s2.clear();
		System.out.println(s2);

		TreeSet<Integer> s3 = new TreeSet<>();
		for (int i = 20; i > 0; i--) {
			s3.add(i);
		}
		s3.add(0);
		System.out.println(s3);
		s3.remove(Integer.valueOf(5));
		s3.remove(3);
		System.out.println(s3);
		System.out.println(s3.contains(2));
		System.out.println(s3.isEmpty());
		System.out.println(s3.size());
		s3.clear();
		System.out.println(s3);

	}

}