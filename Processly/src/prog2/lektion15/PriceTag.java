package prog2.lektion15;

public class PriceTag {

	
	public Fruits addNewFruitsToTheSupermarket(int price) {
	
		return new Apple();
	}
	
	
	
	
	public void createPriceTag(Fruits fruit, String text) {
	
		fruit.setText(text);
	}
}
