package Day17;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
String str = "   hello my world  ";
System.out.println(str.strip());
System.out.println(str.trim());
System.out.println(str.replace(" ", ""));
System.out.println(str.replaceAll("\\s", ""));

int[] num = {1,2,3,4,5};
System.out.println(Arrays.toString(num));

String str1 = "hello my world";
String[] spli = str1.split(" ");

System.out.println(Arrays.toString(spli));
Scanner sc=new Scanner(System.in);

	}

}