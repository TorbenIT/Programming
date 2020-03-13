package university.people;

import prog1.lektion12.lists.Person;

public class Professor extends Person{

	public Professor(String name, int age) {
		super(name, age);
		
	}
	
	
	public static void main(String[] args) {
	
		Professor p = new Professor("Laura Carstensen", 66);
		
		p.setFirstName("Laura");
		p.setLastName("Carstensen");
		
		System.out.println("Professor " + p.getFirstName() + " " + p.getLastName());
	}

}
