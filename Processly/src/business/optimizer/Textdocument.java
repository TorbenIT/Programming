package business.optimizer;

public class Textdocument {

	/* beliebige Anzahl von Textzeilen
	 Zeile: beliebe Anzahl Zeichen
	 2 dimensionales Char Array
	 txt[zeile][spalte]
	 Leerzeilen über null Referenz, */
	
	
	public static void main(String[] args) {
	
		char[][] doc = {
				{'F', 'o', 'r', ' ', 't', 'h'},
				{'N', 'e', 'w', ' ', 'd'},
				{'S', 'u', 'r', 'v', 'e', 'i'}
		};
		
		char[][] paragraph2 = new char[5][];
		
		String row1 = "Back in the 1980s,";
		String row2 = "scientists completed a ten-year survey";
		String row3 = "on the earthquake risk in California;";
		String row4 = "and they came up";
		String row5 = "with an alarming prediction.";
		
		paragraph2[0] = row1.toCharArray();
		paragraph2[1] = row2.toCharArray();
		paragraph2[2] = row3.toCharArray();
		paragraph2[3] = row4.toCharArray();
		paragraph2[4] = row5.toCharArray();
		
		print(concat(doc, 3, paragraph2));
	}
	
	
	
	
	// show/ print content of a text file on the screen
	public static void print(char[][] document) {
	
		for (int row=0; row < document.length; row++) {
		
			if (document[row] == null) {
			
				System.out.print(" ");
			
			} else {
			
				for (int col=0; col < document[row].length; col++) {
				
					System.out.print(document[row][col]);
				}
			}
			System.out.println();
		}
	}
	
	
	// count chars in a txt file
	public static int countChars(char[][] document) {
	
		int counter = 0;
		
		for (int row=0; row < document.length; row++) {
			
			if (document[row] == null) {
			
				continue;
			
			} else {
			
				for (int col=0; col < document[row].length; col++) {
					
					if ( document[row][col] != ' ') {
					
						counter++;
					}
				}
				
			}
		}
	 return counter;
	}
	
	// swap two lines in a txt file
	public static boolean swap(int firstL, int secondL, char[][] doc) {
	
		if (firstL > doc.length || secondL > doc.length) {
		
			return false;
		}
		
		char[] tmpRow = doc[firstL];
		
		doc[firstL] = doc[secondL];
		
		doc[secondL] = tmpRow;
		
		return true;
	}

	// combine two .txt files
	public static char[][] concat(char[][] doc, int row, char[][] newDoc){
	
		if (row > doc.length) {
		
			throw new RuntimeException("Invalid row position");
		}
		
		char[][] file = new char[doc.length + newDoc.length][];
		
		int rowTmp = 0;
		
		for (int i=0; i < doc.length; i++) {
			
			if (i == row) {
			
				rowTmp = row; // ab hier wird
				
				for (int j=0; j < newDoc.length; j++) {
					// newDoc Zeile für Zeile in das andere Document gefügt
					file[rowTmp] = newDoc[j];
					rowTmp++;
				}
			}
			file[rowTmp] = doc[i];
			rowTmp++;
		}
	 return file;
	}
	




}
