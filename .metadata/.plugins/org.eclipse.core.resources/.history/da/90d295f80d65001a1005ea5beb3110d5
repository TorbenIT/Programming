package prog1.klausur;

public class Preis_String {

	public static void main(String[] args) {
	
		System.out.println(wandleUmInCents("1,99"));
	}
	
	
	
	
	public static char[] wandleUmInCents(String preis) {
	
		int counter = 0;
		
		char[] result;
		
		String cent = preis.replace(",", "");
		
		char[] cents = cent.toCharArray();
		
		for (int i=0; i < cents.length; i++) {
		
			if ( cents[i] == '0')
				counter++;
		}
		
		result = new char[cents.length - counter];
		
		
		int j = 0;
		for (int i=0; i < result.length; i++) {
			
			if (cents[i] != '0') {
				
				result[j] = cents[i];
				
				j++;
			}
		}
		
		
		return result;
	}
}
