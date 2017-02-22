import java.util.Scanner;

public class ComputeDeviation {
	// Set length
	static final int SIZE = 10;

	public static void main(String[] args) {
		// Problem 7.11
	     Scanner input = new Scanner(System.in);
	     //User enter numbers
	     double[] numbers = new double[SIZE];
	     System.out.print("Enter " + SIZE + " numbers: ");
	     
	      for (int i = 0; i < numbers.length; i++) {
	    	  numbers[i] = input.nextDouble();
	      }
	      
	        System.out.println("The mean is: " + mean(numbers));
	        System.out.println("The standard deviation is: " + deviation(numbers));
	    }
		// Calculate Deviation
	    public static double deviation(double[] x) {
	        double mean = mean(x);
	        double deviation = 0;
	        
	        for (int i = 0; i < x.length; i++) {
	            deviation += Math.pow(x[i] - mean, 2);
	        }
	        
	        return Math.sqrt(deviation / (x.length - 1));
	    }
	    // Find Mean
	    public static double mean(double[] x) {
	        double total = 0;
	        
	        for (int i = 0; i < x.length; i++) {
	            total += x[i];
	        }
	        return total / x.length;
	    }
}
