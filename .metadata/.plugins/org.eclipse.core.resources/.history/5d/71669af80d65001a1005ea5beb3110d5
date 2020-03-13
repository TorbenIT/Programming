package prog1.klausur;

public class Letters_String {

	public static int countUppercaseLetters(String sentence) {
	
		int counter = 0;
		char[] letters = sentence.toCharArray();
		
		
		
		for (int i=0; i < letters.length; i++) {
		
			char c = letters[i];
			
			if (c >= 'A' && c <= 'Z') {
			
				counter++;
			}
		}
	
	  return counter;	
	}
	
	
	public static void main(String[] args) {
	
		int capitals = countUppercaseLetters("Boston is rich in history and local personality.");
		
		System.out.println("The sentence has " + capitals + " Capital.");
	}
}
