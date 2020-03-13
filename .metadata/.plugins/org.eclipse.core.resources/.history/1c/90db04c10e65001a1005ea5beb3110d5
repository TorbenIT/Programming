package prog1.lektion12.lists;

public class ShoppingCart {

	private Fruit start;
	
	private int size = 0;
	
  // Programmstartpunkt
	public static void main(String[] args) {
	
		ShoppingCart customer = new ShoppingCart();
		
		customer.addToShoppingCart(new Fruit("Apple"));
		
		customer.addToShoppingCart(new Fruit("Lemon"));
		
		
		
		customer.printList();
	}
	
	
  // Konstruktor

  // GETTER--- SETTER
	public Fruit getStart() { return start; }
	
	public void setStart(Fruit f) { this.start = f; }
	
	public int getSize() { return size; }

	public void setSize(int n) { this.size = n; }
	
  // Methoden 														addToPosition()
	public void addToShoppingCart(Fruit f) {
	
		if (size == 0) 
			setStart(f);
		else {
		
			Fruit temp = start;
			
			while ( temp.getNext() != null) {
			
				temp = temp.getNext();
			}
			temp.setNext(f);		
		}

	 size++;	
	}
	

	public void printList() {
	
		System.out.println("Deine Einkaufsliste: ");
		
		if (size == 0) {
		
			System.out.println("\t is empty!");
			return;
		}
		
		Fruit temp = start;
		
		for (int i=0; i < size; i++) {
		
			System.out.println((i+1)+". \t" +temp.getName());
			temp = temp.getNext();
		}
	}
}
