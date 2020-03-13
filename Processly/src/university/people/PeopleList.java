package university.people;

import javax.tools.utilities.*;

public class PeopleList {

	private Element start, endOfList;
	
	
   // adds to the list, so that you can print out normally and reversefully
	public void addByAge(Element newNode) {
		
	    if (start == null) {
	    	
	        start = newNode;
	        
	    } else {
	    	Element headTemp = start;
	    	Element temp = null;
	        while (headTemp.getNext() != null) {
	            if (newNode.getAge() > headTemp.getAge() && temp != null) {
	                temp.setNext(newNode);
	                
	                newNode.setPrev(temp);
	                
	                newNode.setNext(headTemp);
	                
	                headTemp.setPrev(newNode);
	                
	                break;
	           
	            } else {    
	                // for the next loop
	            		temp = headTemp;
	            		headTemp = temp.getNext();
	            	
	            }
	        
	        } // end while
	        
	        
	        if (newNode.getAge() > headTemp.getAge()) {
	            
	        	if (temp != null) {
	        	
	        	temp.setNext(newNode);

	        	newNode.setPrev(temp);
	        	
	        	newNode.setNext(headTemp);

                headTemp.setPrev(newNode);
	        	
	           } else {
				
	        	   start = newNode;
	        	   
	        	   newNode.setNext(headTemp);
	        	   
	        	   headTemp.setPrev(newNode);
			   }
	        	
	        } else {
	        
	        	headTemp.setNext(newNode);
	        	
	        	newNode.setPrev(headTemp);
	        }
	    }
			
	}
	
	
	public static void main(String[] args) {
	
		PeopleList people = new PeopleList();
		
		people.addByAge(new Element(97, "Anderson"));
		
		people.addByAge(new Element(100, "Andrew"));
		
		people.addByAge(new Element(79, "Anfinsen"));
		
		people.addByAge(new Element(59, "Banerjee"));
		
		people.addByAge(new Element(84, "Bishop"));
		
		people.addByAge(new Element(78, "Bridgman"));
		
		people.printPeopleList();
		
		Element searchResult = people.search("Smith");
		
		System.out.println("Letztes Element: " + people.getLastNode().getLastName());
		
	}


	public Element search(String lastName) {
		
		Element temp = start;
		int counter = 1;
		
		while ( temp != null) {
		
			if (lastName == temp.getLastName()) {
			
				System.out.println( lastName +" ist an der Stelle " + counter + " in der Liste.");
				return temp;
			}
			
			counter++;
			temp = temp.getNext();
		}
		
		if (temp == null) 
			System.out.println(lastName + " ist (noch) nicht in der Liste enthalten.");
		
		return null;
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
	
	public Element getLastNode() {
	
		int listLength = countNodes(), counter=1;
		
		Element temp = start;
		
		while (temp != null) {
		
			if (listLength == counter) {
			
				return temp;
			}
			
			
			counter++;
			temp = temp.getNext();
		}
	
		return null;
	}
	
	public void printPeopleList() {
		
		Element temp = start;
		
		while ( temp != null) {
		
			System.out.println(temp.getLastName() + ", " + temp.getAge());
			
			temp = temp.getNext();
		}
		
		endOfList = getLastNode();
		
		while ( endOfList != null) {
			
			System.out.println(endOfList.getLastName() + ", " + endOfList.getAge());
			
			endOfList = endOfList.getPrev();
		}
		
	}
}