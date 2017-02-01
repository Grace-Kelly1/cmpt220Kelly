import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		// Problem 4.20
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String words = input.nextLine();
		
		int length = words.length();
		String firstCharacter = String.valueOf(words.charAt(0));
		
		System.out.println("The length of your string is " + length + " and the first character is " + firstCharacter);
		

	}

}
