package Day16;

public class vowelconsonants {
void vowelconsonants(String str)
{
	String s1 = str.toLowerCase();
	int vcount=0,ccount=0;
	for(int i=0;i<str.length();i++)
	{
		
	if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u')
	{
		vcount++;
	}
	else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
	{
		ccount++;
	}
	}
	System.out.println("vowels="+vcount+"consonants="+ccount);
	
	
}
	public static void main(String[] args) {
vowelconsonants v = new vowelconsonants();
v.vowelconsonants("suraj anna  birthday");
	}

}
