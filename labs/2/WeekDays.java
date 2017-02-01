import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// Problem 3.5
		Scanner input = new Scanner(System.in);
		// Recieve inputs
		System.out.println("Enter an the integer that corresponds to the day of the week (Sunday is 0, Monday is 1,...,and Saturday is 6)");
		int today = input.nextInt();
		
		System.out.println("Enter number of days that will pass since today");
		int daysPassed = input.nextInt();
		// Calculations for future day
		int futureDay = (today + daysPassed) % 7;
		 
		String result = "";
		//Connecting integers with days of the week
		switch(today){
			case 0: result = "Sunday";
			break;
			case 1: result = "Monday";
			break;
			case 2: result = "Tuesday";
			break;
			case 3: result = "Wednesday";
			break;
			case 4: result = "Thursday";
			break;
			case 5: result = "Friday";
			break;
			case 6: result = "Saturday";
			break;
		}
		//Final output
		if (futureDay == 0){
            System.out.println("Todays is " + result + " and the future day is Sunday");
        }else if(futureDay == 1){
            System.out.println("Todays is " + result + " and the future day is Monday");
        }else if(futureDay == 2){
            System.out.println("Todays is " + result + " and the future day is Tuesday");
        }else if(futureDay == 3){
            System.out.println("Todays is " + result + " and the future day is Wednesday");
        }else if(futureDay == 4){
            System.out.println("Todays is " + result + " and the future day is Thursday");
        }else if(futureDay == 5){
            System.out.println("Todays is " + result + " and the future day is Friday");
        }else if(futureDay == 6){
            System.out.println("Todays is " + result + " and the future day is Saturday");
        }
		
	}

}
