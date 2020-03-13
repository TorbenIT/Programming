package time.management;

import javax.tools.utilities.InputReader;

public class TimeManager {

	static int hours=0, minutes=0;
	
	static int count;
	static int i = 1;
	
	
	public static void main(String[] args) {
	
		// 13 h 5 min, 4h 15 min
		System.out.println("Wie viele Eingaben: ");
		
		count = InputReader.readInt();
		
		System.out.println("Schnell? (y)(n)");
		char in = InputReader.readFirstChar();
		
		if (in == 'y') {
		
			doItFast(13, 5, count);
		
		} else if(in == 'n')
			doItSlowly();
		

		InputReader.closeScanner();
		
		System.out.println("Stunden: " + hours + ", Minuten: " + minutes);
		
	}


	private static void doItFast(int workedHours, int workedMinutes, int count) {
		
		hours = workedHours;
		minutes = workedMinutes;
		
		while ( i <= count) {
		
			int h = 4;
			
			int m = 15;
			
			hours = hours + h;
			
			minutes = minutes + m;
			
			if (minutes >= 60) {
				
				hours = hours + 1;
				
				int minTemp = minutes;
				
				minutes = minutes % 10;
			}
			
			i++;
		}
		
	}


	private static void doItSlowly() {
		
		while ( i <= count) {
			
			System.out.println("Deine Stunden: ");
			
			int h = InputReader.readInt();
			
			
			System.out.println("Deine Minuten: ");
			
			int m = InputReader.readInt();
			
			
			calculateTime(h, m, count);
			
			i++;
		}
		
		
	}


	private static void calculateTime(int h, int m, int count) {
	
		hours = hours + h;
		
		minutes = minutes + m;
		
		if (minutes >= 60) {
			
			hours = hours + 1;
			
			int minTemp = minutes;
			
			minutes = minutes % 10;
		}
		
	}
}
