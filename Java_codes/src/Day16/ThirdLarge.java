package Day16;
import java.util.*;
public class ThirdLarge {
void thirdlarge(int[] a)
{ Set<Integer> set = new TreeSet<>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	
	List<Integer> list = new ArrayList<>(set);
	System.out.println(list.get(list.size()-3));
}
	public static void main(String[] args) {
		ThirdLarge third = new ThirdLarge()
;int[] a = {5,2,3,1,6};
	third.thirdlarge(a);}
}