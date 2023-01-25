package Day4;

public class LeadingAndTrailingSpace {
public String leadTrail(String str)
{
	//str = str.strip(); // JAVA 11 uses the Character.isWhitespace() method
	str = str.trim();//identifies any character with a codepoint value less than or equal to U+0020 as a whitespace
	return str;
}
	public static void main(String[] args) {
		LeadingAndTrailingSpace obj = new LeadingAndTrailingSpace();
		System.out.println(obj.leadTrail("   Hello    "));

	}

}
