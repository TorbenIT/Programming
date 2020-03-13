package test.tutorials;
public class MagischesQuadrat {
	public static void main(String[] args) {
		int[][] quadrat = {{16, 6, 9, 3}, {1, 11, 8, 14}, {7, 13, 2, 12}, {10, 4, 15, 5}};
		for (int i = 0; i < quadrat.length; i++) {
			for (int j = 0; j < quadrat.length; j++) System.out.print(quadrat[i][j] + " ");
			System.out.println();
		}
		System.out.println(ueberpuefeQuadrat(quadrat));
	}
	
	public static int ueberpuefeQuadrat(int[][] quadrat) {											//alternativ zu int boolean
		int magischeZahl = 0;
		int pruefZahlZeile = 0;
		int pruefZahlSpalte = 0;
		int pruefZahlDiagonal1 = 0;
		int pruefZahlDiagonal2 = 0;
		for (int i = 0; i < quadrat.length; i++) {
			for (int j = 0; j < quadrat[i].length; j++) {
				if (i == 0) magischeZahl += quadrat[i][j];
				pruefZahlZeile += quadrat[i][j];
				pruefZahlSpalte += quadrat[j][i];
			}
			if (pruefZahlZeile != magischeZahl || pruefZahlSpalte != magischeZahl) return -1;		//alternativ zu -1 false
			pruefZahlZeile = 0;
			pruefZahlSpalte = 0;
		}
		int zeile = 0;
		int spalte = 0;
		while (zeile < quadrat.length) {
			pruefZahlDiagonal1 += quadrat[zeile][spalte];
			zeile++;
			spalte++;
		}
		zeile = 0;
		spalte = quadrat.length - 1;
		while (zeile < quadrat.length) {
			pruefZahlDiagonal2 += quadrat[zeile][spalte];
			zeile++;
			spalte--;
		}
		if (pruefZahlDiagonal1 != magischeZahl || pruefZahlDiagonal2 != magischeZahl) return -1;	//alternativ zu -1 false
		return magischeZahl;																		//alternativ zu magischeZahl true
	}
}