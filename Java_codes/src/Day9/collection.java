package Day9;

import java.util.Arrays;
import java.util.List;

public class collection {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		Integer a[] = new Integer[list.size()];
		list.toArray(a);
		for(int i: a)
		{
			System.out.println(i);
		}
		
		

	}

}
