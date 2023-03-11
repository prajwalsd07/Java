package Day20;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
	

	public static void main(String[] args) {

		Map<Integer,String> m = new HashMap<>();
		m.put(1,"one");
		m.put(3,"three");
		m.put(6,"six");
		m.put(5,"five");
		m.put(4,"four");
		m.put(2,"two");
		System.out.println(m);
		System.out.println(m.remove(5));
		System.out.println(m);
		m.put(4,"fore"); // Overrides value before
		System.out.println(m);
		System.out.println(m.containsKey(2));
		System.out.println(m.containsValue("fore"));
		m.putIfAbsent(5,"five");
		m.put(null, "ten");
		m.put(11,null);
		System.out.println(m);
		
		
		for(Map.Entry<Integer, String> e : m.entrySet())
		{
			System.out.println(e.getKey()+" "+ e.getValue());
		}
		
		
		System.out.println("treeMap concept");
		
		
		Map<Integer,String> m1 = new TreeMap<>();
		m1.put(1,"one");
		m1.put(3,"three");
		m1.put(6,"six");
		m1.put(5,"five");
		m1.put(4,"four");
		m1.put(2,"two");
		System.out.println(m1);
		System.out.println(m1.remove(5));
		System.out.println(m1);
		m1.put(4,"fore"); // Overrides value before
		System.out.println(m1);
		System.out.println(m1.containsKey(2));
		System.out.println(m1.containsValue("fore"));
		m1.putIfAbsent(5,"five");
		m1.put(11,null);
		System.out.println(m1);
		
		
		for(Map.Entry<Integer, String> e : m1.entrySet())
		{
			System.out.println(e.getKey()+" "+ e.getValue());
		}
		
		System.out.println(m1.values());
		
		System.out.println(m1.keySet());
		
		System.out.println(m1.get(2));
		
		

	}

}
