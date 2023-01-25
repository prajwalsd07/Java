package Day5;

import java.util.Scanner;

public class LinearSearch {
public int linear(int[] a , int ele)
{
	int loc= -1;
	for(int i =0;i<a.length;i++)
	{
		if(a[i]==ele)
		{
			loc=i;
		}
	}
	return loc;
}
	public static void main(String[] args) {
		
LinearSearch lin = new LinearSearch();
int[] a = {1,4,2,8,5,9};
Scanner sc = new Scanner(System.in);
int ser = sc.nextInt();

System.out.println(lin.linear(a, ser));
sc.close();

	
	}

}
