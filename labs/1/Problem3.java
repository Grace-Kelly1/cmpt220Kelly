import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// Problem 2.5
		Scanner input = new Scanner(System.in);
		//Subtotal and gratuity
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		System.out.println("Enter the gratuity rate: ");
		double gratuityRate = input.nextDouble();
		//Compare gratuity and total
		double gratuity = (subtotal * (gratuityRate * .01));
		double total = gratuity + subtotal;
		//Display
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}

}
