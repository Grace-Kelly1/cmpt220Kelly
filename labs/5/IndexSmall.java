import java.util.Scanner;

public class IndexSmall {
	// Set length to 10
	static final int SIZE = 10;
	
	public static void main(String[] args) {
		// Problem 7.10
        double[] numbers = new double[SIZE];
        Scanner input = new Scanner(System.in);
        // Have user enter 10 numbers
        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = input.nextDouble();
        }
        // Produce
        System.out.println("The index of the smallest number is: " + indexOfSmallestElement(numbers));

    }
	// Find index of smallest number
    public static int indexOfSmallestElement(double[] array) {

        int index = 0;
        double low = array[index];
        for (int i = 0; i < array.length; i++) {

            if (low > array[i]) {
                low = array[i];
                index = i;
            }
        }
        return index;
    }
}