import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calender {

	public static void main(String[] args) {
		// 9.5
		// Get current date
        System.out.println(new Date().toString());
        // Get year, month and day
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);
        // Display the year, month, and day
        System.out.printf("Year: %d Month: %d Day: %d", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
    }
}

