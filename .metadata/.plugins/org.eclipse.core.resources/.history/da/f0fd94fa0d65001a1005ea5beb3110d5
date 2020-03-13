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
			 *  - Länge des Arrays ist nach erzeugung festgelegt
			 *  - Löschen von Einträgen hinterlässt Lücken
			 *  - sortiertes Einfügen ist nicht ohne größeren Aufwand möglich
			 * */
	
		// 	  Vor- und Nachteile von Listen
			/*	+ an beliebiger Stelle neue Artikel einfügen
			 *  + löschen von Artikeln, ohne Lücken zu hinterlassen
			 *  + problemlos zu vergrößeren/ erweitern
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
