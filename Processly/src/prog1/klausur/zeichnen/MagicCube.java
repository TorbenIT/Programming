package prog1.klausur.zeichnen;

public class MagicCube {

	public static void main(String[] args) {
	
		int zeilen = 4;
		
		for (int i = 1; i <= zeilen; i++) {
			
			for (int j = 1; j <= zeilen; j++) {
				
				if (1 < i && i < 4 && 1 < j && j < 4) {
				
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
				

					

			}
			System.out.println();
		}
	}
}
