package Day9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functional {

	public static void main(String[] args) {
		Predicate<Integer> p = k -> k > 10;

		System.out.println(p.test(11));

		Consumer<String> c = s -> System.out.println(s.length());
		c.accept("suraj");

		Supplier<Double> s = () -> Math.random();

		System.out.println(s.get());

		Function<Integer, String> f = in -> in * 10 + "this is magic ";
		System.out.println(f.apply(22));

		List<String> str = Arrays.asList("suraj", "praj", "akash");

		str.forEach(k -> System.out.println(k));

		List<Integer> ilist = Arrays.asList(10, 10, 101, 10);
		ilist.stream().filter(h -> h < 100).sorted().map(m -> {
			int o = 0;
			o = o + m;
			return o;
		}).forEach(k -> System.out.println(k));

	}

}
