package Day3;

public class Palindrome {
public boolean palin(String str)
{
	for(int i =0;i<str.length()/2;i++)
	{
		if(str.charAt(i)!=str.charAt(str.length()-i-1))
{
	return false;
}
	}
	return true;
}
	public static void main(String[] args) {
	
Palindrome pal = new Palindrome();
System.out.println(pal.palin("olllklo"));
	}

}
