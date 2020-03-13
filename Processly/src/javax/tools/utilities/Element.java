package javax.tools.utilities;

public class Element {
		
		private int number, age;
		
		private String lastName;
		
		private Element next, prev;
		
		
		public Element(int rand) {
		
			this.number = rand;
		}
		
		public Element(int a, String l) {
		
			this.age = a;
			
			this.lastName = l;
		}
			
		public int getNumber() { return number; }
		
		public Element getNext() { return next; }
		
		public Element getPrev() { return prev; }
		
		public void setNext(Element n) { this.next = n; }
		
		public void setPrev(Element n) { this.prev = n; }
		
		public int getAge() {	return age;	}

		public void setAge(int age) {			this.age = age;	}

		public String getLastName() {	return lastName;	}

		public void setLastName(String lastName) {	this.lastName = lastName;	}				
}


