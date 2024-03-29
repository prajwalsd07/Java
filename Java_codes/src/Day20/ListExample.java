package Day20;


import java.util.*;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// list.add(1);
		// list.add(2);
		// list.add(0, 2); //at index

		System.out.println(list);
		List<Integer> list1 = Arrays.asList(6,4,2,9,1,5,8,7);
		//list1.forEach(n-> System.out.println(n));

		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list1.get(4));
		System.out.println(list1.indexOf(1));
		list.remove(0);
		System.out.println(list);
		list.remove(Integer.valueOf(3));
		System.out.println(list);

		System.out.println(list.toString());
		
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("hihihihhihihihihhihihi");
		
		
		Bus bus0 = new Bus(20, 4);
		Bus bus1 = new Bus(30, 6);
		Bus bus2 = new Bus(50, 8);
		Bus bus3 = new Bus(70, 10);
		Bus bus4 = new Bus(100, 14);

		List<Bus> bus = new ArrayList<>();
		bus.add(bus0);
		bus.add(bus1);
		bus.add(bus2);
		bus.add(bus3);
		bus.add(bus4);

		System.out.println(bus);

		for (Bus b : bus) {
			System.out.println(b);
		}

		Iterator<Bus> it = bus.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(bus.size());
		System.out.println(bus.contains(bus3));

		bus.set(1, bus4);
		System.out.println(bus);

	}

}
