import java.util.Scanner;

public class VowelOrCon {

	public static void main(String[] args) {
		// Problem 4.13
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		
		char letter = input.nextLine().charAt(0);
		
		if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')){
			switch(letter){
		      case 'a':
		      case 'e':
		      case 'i':
		      case 'o':
		      case 'u':
		      case 'A':
		      case 'E':
		      case 'I':
		      case 'O':
		      case 'U': 
		      System.out.println(letter + " is a vowel"); 
		      break;
		      
		      default: 
		      System.out.println(letter + " is a consonant");
			}
		}
		else{
			System.out.println(letter + " is an invalid input");
		}

	}

}
