import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		//11.13
		//Ask user for 10 integers
        System.out.print("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(input.nextInt());
        //Remove duplicates
        System.out.println("Removing duplicates...");
        removeDuplicate(list);
        System.out.println("Displaying list...");
        System.out.println(list);
    }
	//Remove duplicates method
    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (!temp.contains(list.get(i))) {
                temp.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(temp);

    }
}