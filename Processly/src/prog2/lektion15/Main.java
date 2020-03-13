package prog2.lektion15;

public class Main {

	public static void main(String[] args) {
	
		Car ch = new Car(false, "Ford"); // Vererbung, super()
		
		President trump = new President(50, "Trump");
		
		Fruits fruits;
		
		
		System.out.println("My name is " + trump.name + " and I receive everywhere " + trump.discount + " % Rabatt.");
	
		fruits = new Apple(); // Generalisierung, Substitutionsprinzip, @Override
		
		System.out.println("The price of 1 kilogram apples is " + fruits.calculatePrice() + " $");
		
	}
}
