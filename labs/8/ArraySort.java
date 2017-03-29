import java.util.ArrayList;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		//11.11
		//Ask user for 5 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(input.nextInt());
        //Display sorted
        System.out.println("Sorting numbers...");
        sort(list);
        System.out.println("Displaying numbers...");
        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> list) {
        list.sort(null);
    }
}



