package prog2.lektion15;

public class Car extends Vehicle{

	protected boolean engineDamage = false;
	
	
	public Car(boolean isThereAnIssue, String brand) {
		
		super(brand); // solution for different type parameters
		
		this.engineDamage = isThereAnIssue;
	}
}
