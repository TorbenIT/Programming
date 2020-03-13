package business.optimizer;

import javax.tools.utilities.*;

public class Dictionary {

	
	Tree tree = new Tree();
	String word, def;
	int event;
	boolean running = true;
	
	
  // Start the Dictionary Program	
	public static void main(String[] args) {
	
		Dictionary dictionary = new Dictionary();


	}
	
	
  // Constructor
	public Dictionary() {
	
		while (running) {
		
			System.out.println("Hola! Bienvenida en el viaje al espanol");
			
			System.out.println("Einf�gen in das W�rterbuch (1), "
					+ "Suchen im W�rterbuch (2), "
					+ "Programm beenden (3): ");
			
			event = InputReader.readInt();
			
			handleEvent(event);
		}
		
	}

 // Methods
	public void handleEvent(int e) {
		
		switch (e) {
		case 1:
			System.out.println("Add a new word please: ");
			word = InputReader.readString();
			System.out.println("What is the defintion of " + word);
			def = InputReader.readString();
			TreeNode node = new TreeNode(word, def);
			tree.insert(node);
			tree.print();
			break;
		case 2:
			System.out.println("What are you looking for?");
			word = InputReader.readString();
			tree.search(word);
			break;
		case 3: 
			running = false;
			InputReader.closeScanner();
			System.exit(0);
		default:
			System.out.println("This is not an option!");
			break;
		}	
	}
}
