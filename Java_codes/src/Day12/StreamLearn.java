package Day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLearn {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 7, 3, 9, 5);
		Stream<Integer> s = list.stream().filter(n -> n % 3 == 0).sorted().map(n -> n * 2);
		s.forEach(n-> System.out.println(n));
		
		int sum = list.stream().sorted().reduce(0,(a,b) -> a+b);
		list.stream().sorted();
		System.out.println(sum);

	}

}
