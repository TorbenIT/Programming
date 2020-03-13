package time.management;

import javax.tools.utilities.InputReader;

public class Calendar {

	public static void main(String[] args) {
	
		WeekDay day = WeekDay.Friday;
		
		System.out.println(" In 5 days is " + WeekDay.values()[(day.ordinal()+5)%7]);
	
		// position of day (Friday) = 4 + 5 = 9 % 7 = 2 = Wednesday
		// %7 = to start the index at 0 again for a new week
		// ---> Index = 0 for Monday + 5 days = Saturday
		
		System.out.println("Give us the day, you would like to see the TODOs: ");
		String in = InputReader.readString();
		day = WeekDay.valueOf(in);
		
		if ( day == WeekDay.Monday) {
			
			System.out.println("New week has started: ");
			// displayToDos();
		} else {
			
			System.out.println("Today is " + day + "!");
		}
	
	
	
		InputReader.closeScanner();
	}
}
