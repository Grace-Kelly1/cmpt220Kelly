import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
		// 9.13
		//Ask user for array size and actual array
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] m = new double[row][column];
        System.out.println("Enter the array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        //Find location of largest
        Location location = Location.locateLargest(m);
        //Display largest location
        System.out.println("The location of the largest element is "
                + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }

}