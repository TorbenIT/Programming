package prog1.klausur.listen.bestellprozess;

public class Bestellung {

	private int bestellNummer;
	
	private Artikel[] artikel = new Artikel[50];
	
	
	
	// b)
	public Artikel[] getArtikel() { return artikel; }
	
	public void setArtikel(int id, String label) {
	
		for (int i=0; i < artikel.length; i++) {
		
			this.artikel[i] = new Artikel(id, label);
		}
	}
	
	// c) Vor- und Nachteile von Arrays
			/*	+ verwendet, um mehrere, gleichartige Daten zu verwalten
			 *  
			 *  - L�nge des Arrays ist nach erzeugung festgelegt
			 *  - L�schen von Eintr�gen hinterl�sst L�cken
			 *  - sortiertes Einf�gen ist nicht ohne gr��eren Aufwand m�glich
			 * */
	
		// 	  Vor- und Nachteile von Listen
			/*	+ an beliebiger Stelle neue Artikel einf�gen
			 *  + l�schen von Artikeln, ohne L�cken zu hinterlassen
			 *  + problemlos zu vergr��eren/ erweitern
			 *  
			 *  - Ohne den Start Knoten, kommt man nicht an die anderen Elemente ran
			 *  - 
			 * */
	
	public void einfuegen(int artNr, String bezeichnung) {
	
		for (int i=0; i < artikel.length; i++) {
		
			if ( artikel[i] == null) {
			
				setArtikel(artNr, bezeichnung);
			}
		}
	}
	
	// d)
	public void loeschen(int artNr) {
		
		
	}
	
}
