import java.util.Scanner;

public class IndexBounds {
	public static void main(String[] args) {
		//12.3
        // Creating 100 random integers 
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        //Asking user to input an index
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index ");
        //Checking 
        try {
            int index = input.nextInt();
            System.out.println("array[" + index + "] = " + array[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("INDEX " + ex.getLocalizedMessage() + " is out of bounds!");
        } catch (Exception ex) {
            System.out.println("INVALID INPUT");
        }
    }
}