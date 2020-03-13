package prog1.klausur.zeichnen;

import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int hoehe = s.nextInt();
		
		int leer;
		
		for (int zeile = 1; zeile <= hoehe; zeile++) {			
			
			// 4 Leerzeichen, 3 Leerzeichen, 2 Leerzeichen, 1 Leerzeichen - 1. Schleife
			// 1 Stern, 2 Sterne, 3 Sterne, 4 Sterne, 5 Sterne
			
			
			for (int spalte = 1; spalte <= hoehe - zeile; spalte++) {
				
				System.out.print(" ");
			}
			
			
			for (int j = zeile+1; j > 1; j--) {
				
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
		s.close();
	}
}
