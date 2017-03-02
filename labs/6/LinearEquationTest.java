import java.util.Scanner;

public class LinearEquationTest {

	public static void main(String[] args) {
		// 9.11
		Scanner input = new Scanner(System.in);
		//Ask for letters
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linear = new LinearEquation(a,b,c,d,e,f);
        //Decide if solvable and Display
        if (linear.isSolvable()) {
            System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }

}