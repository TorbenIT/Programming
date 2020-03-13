package shop.CashSystem;

public abstract class RhythmGenerator {

	RhythmAI client;
	
 // Constructor	
	public RhythmGenerator(String client) {
			
	}
	
	
	
	
	public abstract void start();
	
	public abstract void stop();
	
	public abstract void setRhythm(int runTime);
	
}
