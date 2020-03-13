package prog1.lektion12.lists;

import prog1.lektion12.lists.Person;

public class PhoneBook {

	static Person start = null;
	
	
	public static void main(String[] args) {
	

			start = new Person("Anderson", 97);
		
			Person p = new Person("Anfinson", 79);
		
			
			start.setNext(p);
			
			p = new Person("Banerjee", 59);
			
			
			
			
			Person temp = start.getNext();
			
			Person headTemp = start;
			
			while (temp.getNext() != null) {
			
				if (p.getAge() > start.getAge()) {
				
					p.setNext(temp);
					
					headTemp.setNext(p);
					
					break;
				
				} else {
				
					headTemp = temp;
					
					temp = temp.getNext();
				}

			}
//			temp.setNext(p);
			
	
			
			
			showPhoneList();
	}

	private static void showPhoneList() {
		
		Person temp = start;
		
		while (temp.getNext() != null) {
		
			System.out.println(temp.getLastName() + ", " + temp.getAge());
			
			temp = temp.getNext();
		}
	}
	
}
