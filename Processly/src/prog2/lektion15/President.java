package prog2.lektion15;

public class President extends Customer{

	int discount;
	
	
	public President(int amount, String name) {
	
		super(name);
		
		this.discount = amount;
	}
}
