package lab3;

import java.util.Scanner;

public class KiloPounds {

	public static void main(String[] args) {
		// Problem 5.5
		Scanner input = new Scanner(System.in);
		// Display top of table
		System.out.print("Kilograms" + "\t" + "Pounds" + "\t" + "|" +"      Pounds" + "\t" + "  Kilograms \n");
		// Initialize variables
		int highestkg = 199;
		int highestlb = 515;
		int kg = 1;
		int i = 2;
		int lb = 15; 
		int j = 5;
		// Loop for table to continue till highest point 
		while (kg < highestkg && lb < highestlb) {
			kg = kg + i; 
			lb = lb + j;
			double conversionkg = Math.round((kg * (double)2.2) * 10.0) / 10.0;
			double conversionlb = Math.round((lb * (double).454) * 100.0) / 100.0;
			System.out.println (kg + "\t        " + conversionkg + "    |  " + lb + "\t       " + conversionlb);
		}
		
		
	}

}
