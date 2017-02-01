import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// Problem 4.9
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a character: ");
		
		String a = input.nextLine();
		char ch = a.charAt(0);
		
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
	}

}
