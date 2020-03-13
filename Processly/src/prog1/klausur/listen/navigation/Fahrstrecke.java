package prog1.klausur.listen.navigation;

public class Fahrstrecke {

  // c)
	Zielort start;
	
	Zielort next;
	
	public Fahrstrecke() {
		
		this.start = null;
	}
	
  // d)
	public void einfuegen(String n, int d) {
	
		if (start == null) { start = new Zielort(n, d); return; }
		
		Zielort temp = start;
		
		while (temp.getNext() != null) { 
		
			temp = temp.getNext(); 
		}
		temp.setNext(new Zielort(n, d));
	}
	
  // e)
	public int gesamtStrecke() {

		int result = 0;
		
		Zielort temp = start;
		
		do {
			
			result = result + temp.getDistanz();
			
			temp = temp.getNext();
		
		} while (temp.getNext() != null);
	
		
		return result;
	}
	
  // f)
	public static void main(String[] args) {
	
		Fahrstrecke route = new Fahrstrecke();
		
		// habe die km jetzt mal so interepretiert:
		
		route.einfuegen("Würzburg", 19); // 19km bis nach Kitzingen
		
		route.einfuegen("Kitzingen", 42); // 42km bis nach Neustadt
		
		route.einfuegen("Neustadt", 49);  // 49km bis nach Nürnberg
		
		route.einfuegen("Nürnberg", 0);   // 0km, weil Zielort
		
		int result = route.gesamtStrecke();
		
		System.out.println("Die Route von Würzburg nach Nürnberg beträgt: " + result + " km.");
	}
	
	
}
