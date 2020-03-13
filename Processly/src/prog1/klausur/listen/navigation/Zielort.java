package prog1.klausur.listen.navigation;

public class Zielort {

	private String name;
	
	private int distanz;
	
	private Zielort next;
	
	
	public Zielort(String n, int d) {
		
		this.name = n;
		
		this.distanz = d;
	}
	
	
	
	public Zielort getNext() { return next; }
	
	public void setNext(Zielort next) { this.next = next; }
	
	public int getDistanz() { return distanz; }
	
	public void setDistanz(int d) { this.distanz = d; }
	
	
	public String toString() { return "Ortsname: " + name + " Distanz: " + distanz + " kmq"; }
	
	
}
