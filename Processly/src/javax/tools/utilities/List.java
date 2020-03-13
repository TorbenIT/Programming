package javax.tools.utilities;

public class List {

	private Element start;
	
	
	public void add(int n) {
	
		Element num = new Element(n);
		
		if (start == null) {	start = num; }
		
		else {
			
			Element temp = start;
			
			while (temp.getNext() != null) {
			
				temp = temp.getNext();
			}
			
			temp.setNext(num);
		}
	}
	
	public void addByAge(Element newNode) {
	
		if (start == null) {
		
			start = newNode;
			return;
		} 
		
		Element nodeTemp = start.getNext();
			
		Element headTemp = start;
			
		while ( nodeTemp != null) {
			
				if (newNode.getAge() < nodeTemp.getAge()) {
				
					newNode.setNext(nodeTemp);
					headTemp.setNext(newNode);
					
					nodeTemp.setPrev(newNode);
					newNode.setPrev(headTemp);
					break;
				} else {
				 // increments to the next loop
					headTemp = nodeTemp;
					
					nodeTemp = nodeTemp.getNext();
					
				} 
		}
		nodeTemp.setNext(newNode);
		
		
		
	}
	
	
	// returns true, if number is in the list
	private boolean located(int n) {
	
		Element temp = start;
		
		while (temp != null) {
			
			if (temp.getNumber() == n) {	return true;	}
			
			
			temp = temp.getNext();
		}
		
		return false;
	}
	
	public int countNodes() {
	
		int counter = 0;
		
		Element temp = start;
		
		while ( temp != null) {
		
			counter++;
			
			temp = temp.getNext();
		}
		
	  return counter;
	}
	
	// Prototype for other list classes
	private int getLocation(int n) {
	
		int counter = 0;
		
		Element temp = start;
		
		while ( temp != null) {
		
			if (temp.getNumber() == n)	return counter;
			
			temp = temp.getNext();
			counter++;
		}
	
	  return counter;
	}
	
	
	public void delete(int n) { // n = 82
	
		Element temp = start; // temp = 82
		
		if (getLocation(n) == 0) {
		
			start = temp.getNext();
			
			return;
		}
		
		
		if (located(n)) {
		
			Element prev = null;
			
			while ( temp != null && temp.getNumber() != n ) {
			
				prev = temp;
				
				temp = temp.getNext();
			}
			
			prev.setNext(temp.getNext());	
		}
			
	}
	
	
	
	
	
	
	
	public void printList() {
	
		Element temp = start;
		
		while ( temp != null) {
			
			if (temp.getNext() == null) System.out.print(temp.getNumber());
			
			else
				System.out.print(temp.getNumber() + ", ");
		
			temp = temp.getNext();
		}
	}

	
	public void printPeopleList() {
		
		Element temp = start;
		
		while ( temp != null) {
			
			System.out.println(temp.getLastName() + ", "
					+ "" + temp.getAge());
		
			temp = temp.getNext();
		}
		
	}
	
}
