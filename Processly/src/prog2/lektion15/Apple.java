package prog2.lektion15;

public class Apple extends Fruits{

	protected int price;
	
	
	public Apple() {
	
		
		
	}
	
	@Override
	public int calculatePrice() {
	
		price = 4;
		
		return price;
	}
}
