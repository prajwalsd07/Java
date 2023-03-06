package Day7;

public class Lcm {
	public int lcm(int a , int b)
	{int i=(a>b)?a:b;
	  while(i>0)
	  {
		  if(i%a==0 && i%b==0)
		  {
			  return i;
		  }
		  i++;
	  }
	  return 0;
	}

	public static void main(String[] args) {
		
Lcm l = new Lcm();
System.out.println(l.lcm(16, 20));
	}

}
