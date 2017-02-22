import java.util.Scanner;

public class SumElements {

	public static void main(String[] args) {
		// Problem 8.1
		// Have user enter matrix
		System.out.print("Enter a 3-by-4 matrix: ");
        Scanner input = new Scanner(System.in);

        // Read user input
        double[][] matrix = new double[3][4];
        
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column" + i +" is " + sumColumn(matrix, i));
        }

    }
	// Column Sums
    public static double sumColumn(double[][] m, int columnIndex) {

        double total = 0;

        for (int i = 0; i < m.length; i++) {
            total += m[i][columnIndex];
        }
        
        return total;
    }
    // Produce Matrix
    public static void displayMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("%5.0f ", matrix[row][column]);
            }
            System.out.printf("\n");
        }
    }

}
