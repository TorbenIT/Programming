package time.management;

import java.time.LocalTime;


public class Timer {

	private float hours = LocalTime.now().getHour();
	
	private float minutes = LocalTime.now().getMinute();
	
	private float seconds = LocalTime.now().getSecond();
	
	
// Constructor	
	public Timer() {
		
	}
	
	public Timer(int hour, int min, int sec) {
	
		if (hour <= 23 && hour >= 0 && min < 60 && min >= 0 && sec < 60 && sec >= 0 ) {
			
			this.hours = hour;
			
			this.minutes = min;
			
			this.seconds = sec;
		
		} else {
			
			float newHour = (hour-24);
			
			this.hours = newHour;
			
			this.minutes = min;
			
			this.seconds = sec;
			
		}
	}
	
	
	
// GETTER ----- SETTER
	public float getHour() {	return hours; }
	
	public float getMin() {	return minutes; }
	
	public float getSec() {	return seconds; }
	
	public void setTimer(int hour, int min, int sec) {
	
		if (hour <= 23 && hour >= 0 && min < 60 && min >= 0 && sec < 60 && sec >= 0 ) {
			
			this.hours = hour;
			
			this.minutes = min;
			
			this.seconds = sec;
		
		} else {
			
			printTime();
		}
	}
	
// Methods	
	public void printTime() {
		
		if (hours < 10) {
			
			System.out.printf("Es ist 0%.0f", hours);
		
		} else {
			
			System.out.printf("Es ist %.0f", hours);
		}
		
		if (minutes < 10) {
			
			System.out.printf(":0%.0f", minutes);
		
		} else {
			
			System.out.printf(":%.0f", minutes);
		}
		
		if (seconds < 10) {
			
			System.out.printf(":0%.0f Uhr.\n", seconds);
		
		} else {
			
			System.out.printf(":%.0f Uhr.\n", seconds);
		}
		

	 // Aufruf Methode  showDayProcess()	
	 //	showDayProcess();
		

	}

	// L2: Prozent vom Tag vergangen, Sekunden bis Midnight, 
	private void showDayProcess() {
		
		System.out.println("Sekunden seit Mitternacht: " 
				+ (hours * 60 * 60 + minutes * 60 + seconds));


		System.out.println("Sekunden bis Mitternacht: " + ((24-hours) * 60 * 60 + (60-minutes) * 60 + (60-seconds)));

		System.out.printf("Prozent vom Tag vergangen: %.2f%%", (hours + ((minutes + seconds/60)/60))/24*100);
		
	}

	public void nextSec() {
	
		this.seconds += 1;
		
		if (this.seconds > 59) {
		
			this.seconds = 0;
			
			this.minutes += 1;
			
			if (this.minutes > 59) {
			
				this.minutes = 0;
				
				this.hours += 1;
				
				if (this.hours >= 24) {
				
					this.hours = 0;

					this.minutes = 0;
					
					this.seconds = 0;
				}
			}
		}
	}
	
	
 // Programstart	
	public static void main(String[] args) throws InterruptedException {
	
		
		
		
		realTimeClock();
	
	}

	

	private static void realTimeClock() throws InterruptedException {
		
		boolean running = true;
		
		
		while (running) {
		
			Timer timer = new Timer();
			
			timer.printTime();
			
			Thread.sleep(1000);
		}
		
	}

	private static void showWorldTimeBuddy() {
		
		Timer timer = new Timer();
		
		int h = (int) timer.getHour(), min = (int) timer.getMin(), 
				sec = (int) timer.getSec();
		
		Timer[] worldTimeBuddy = new Timer[24];
		
		for (int i = 0; i < worldTimeBuddy.length; i++) {
			
			worldTimeBuddy[i] = new Timer(h++, min, sec);
		}
		
		for (int i = 0; i < worldTimeBuddy.length; i++) {
			
			worldTimeBuddy[i].nextSec();
			
			float hours = worldTimeBuddy[i].getHour();
			
			float minutes = worldTimeBuddy[i].getMin();
			
			float seconds = worldTimeBuddy[i].getSec();
			
			
			
			if (hours < 10) {
				
				System.out.printf("Es ist 0%.0f", hours);
			
			} else {
				
				System.out.printf("Es ist %.0f", hours);
			}
			
			if (minutes < 10) {
				
				System.out.printf(":0%.0f", minutes);
			
			} else {
				
				System.out.printf(":%.0f", minutes);
			}
			
			if (seconds < 10) {
				
				System.out.printf(":0%.0f Uhr.\n", seconds);
			
			} else {
				
				System.out.printf(":%.0f Uhr.\n", seconds);
			}
		}
	}
}
