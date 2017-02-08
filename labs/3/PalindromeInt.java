package lab3;

import java.util.Scanner;

public class PalindromeInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		// Prompt the user for integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	public static int reverse(int number) {
		String reverse = ""; 	
		String n = number + ""; 

		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}

		return Integer.parseInt(reverse); 
	}

}