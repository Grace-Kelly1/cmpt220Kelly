import java.util.Scanner;

public class ComputingGCD {
	// Set length to 5
	static final int SIZE = 5;
	 
	public static void main(String[] args) {
		// Problem 7.14
		 int[] numbers = new int[SIZE];
	     Scanner input = new Scanner(System.in);
	     // Have user enter 5 numbers
	     System.out.print("Enter 5 numbers to get their gcd: ");
	     //GCD
	     for (int i = 0; i < numbers.length; i++) {
	    	 numbers[i] = input.nextInt();
	     }
	     
	        System.out.println("The GCD is " + gcd(numbers));
	    }
	//GCD Calc
	public static int gcd(int... numbers) {
	     int gcd = 1;
	     int min = getMin(numbers);
	     int length = numbers.length - 1;

	     int count = 0;
	        
	     for (int i = 2; i <= min; i++) {
	    	 for (int k = 0; k <= length; k++) {
	    		 if (numbers[k] % i == 0) {
	                    count++;
	                    if (count == length) gcd = i;
	                } else {
	                    count = 0;
	                }
	            }
	        }

	        return gcd;
	    }
		// Find Min
	    public static int getMin(int[] array) {
	        int min = array[0];
	        
	        for (int i = 0; i < array.length; i++) {
	            if (min > array[i]) {
	                min = array[i];
	            }
	        }
	        return min;
	    }


	}