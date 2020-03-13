package prog2.lektion15;

public abstract class Fruits {

	protected String description;
	
	boolean healthy = true;
	
	int eatenFruits = 0;
	
	
	public Fruits() {
	
		eatenFruits++;
	}
	

	public abstract int calculatePrice();
	

	
	public String getText() {	return this.description;	}
	
	public void setText(String text) { this.description = text;	}
}
