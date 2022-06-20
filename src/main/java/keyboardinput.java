import java.util.Scanner;

public class keyboardinput {
    public static void main(String[] args) {
        String firstname,fullname,lastname;
        char ch;
        int  age;
        Float  dec;

        System.out.println("Enter your firstname");
        Scanner f=new Scanner(System.in);
        firstname = f.nextLine();
        System.out.println("Welcome Mr/Ms "+ firstname+ " to the Java world ");

        System.out.println("Enter your Lastname");
        lastname = f.nextLine();
        fullname = firstname + lastname;
        System.out.println("Welcome Mr/Ms "+ fullname+ " to the Java world ");

        System.out.println("Enter your age");
        age = f.nextInt();
        System.out.println("Your age is "+ age);

        System.out.println("Enter a decimal number");
        dec = f.nextFloat();
        System.out.println("You entered is "+ dec);

        System.out.println("enter your favrite alphabet");
        ch= f.next().charAt(0);
        System.out.println("you entered "+ ch);

    }

}
