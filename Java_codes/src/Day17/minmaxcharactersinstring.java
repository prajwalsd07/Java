package Day17;
import java.util.*;
public class minmaxcharactersinstring {
void minmax(String str)
{
	char[] ch = str.toCharArray();
	Set<Character> set = new TreeSet<>();
	int i=0;
	while(i<ch.length)
	{
		set.add(ch[i]);
		i++;
	}
	List<Character> list = new ArrayList<>(set);
	
	List<Integer> count = new ArrayList<>();
	
	for(int j=0;j<set.size();j++)
	{int flag=0;
		for(int k=0;k<str.length();k++)
		{
			if(list.get(j)==str.charAt(k))
			{
				flag++;
			}
		}
		count.add(flag);
	}
	
	int max= Collections.max(count);
	int min = Collections.min(count);
	max=count.indexOf(max);
	min=count.indexOf(min);
	
	System.out.println(list.get(max)+"--"+list.get(min));
	
 }
	public static void main(String[] args) {
		
		minmaxcharactersinstring minmax = new minmaxcharactersinstring();
		String str = "grass is greener on the other side";
		str = str.replace(" ","");
		minmax.minmax(str);
	}

}
