package Day3;

public class RemoveSpace {

	public String whiteSpace(String str) {
		char[] ch = str.toCharArray();
		String s = "";
		StringBuilder string = new StringBuilder();
		for (char i : ch) {
			if (!Character.isWhitespace(i)) {
				string.append(i);
				s = s + i;

			}
		}
		// String str1 = String.valueOf(ch);
		System.out.println(s);
		return string.toString();
	}

	public static void main(String[] args) {
		RemoveSpace rem = new RemoveSpace();
		System.out.println(rem.whiteSpace("hello this is prajwal"));
	}

}
