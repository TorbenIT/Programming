package prog1.klausur;

import java.util.*;

public class ValueOf {

	
	
	public static int liesZahl() {
	
		Scanner s = new Scanner(System.in);
		boolean falscheZahl = true;
		int zahl = 0;

		
		do {
				System.out.println("Bitte eine Ganzzahl eingeben: ");
				String n = s.nextLine();
				
				char[] c = n.toCharArray();
				int counter = 0;
				String result = "";
				for (int i=0; i < c.length; i++) { // 1.05
				
					if (c[i] >= '0' && c[i] <= '9') { 
						result += c[i]; 
						counter++;
						
					} 
					else { continue; }
				}
				
				
				
				if (c.length == counter) {
					
					zahl = Integer.valueOf(result);
					falscheZahl = false;
				}
				
				
		} while (falscheZahl);
	
		
	
		
		
		return zahl;
	
	}
	


	public static void main(String[] args) {
	
		System.out.println(liesZahl());
	}

}
