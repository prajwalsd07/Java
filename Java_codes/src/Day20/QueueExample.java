package Day20;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();
		q1.offer("hi");
		q1.add("hello");
		q1.add("world");
		System.out.println(q1);
		System.out.println(q1.peek());
		String s2 = q1.poll();
		System.out.println(s2);
		System.out.println(q1);
		
		
	}

}
