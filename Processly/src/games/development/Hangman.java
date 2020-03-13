package games.development;

import java.util.*;

public class Hangman {

	public static boolean check(char[] arr, String userInput) {
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
	
		String[] words = {"Convert", "Busy", "Sex", "CISSP", "Cplusplus"};
	
		int rand = (int) (Math.random() * words.length), success = 0, attemps = 1;
		
		String word = words[rand], input = "", output = "";
		
		char[] charsInWord = word.toCharArray(), result = new char[charsInWord.length], locatedLetters = new char[charsInWord.length];
		char c;
		boolean win = false, located = false;
		Scanner s = new Scanner(System.in);
		
		
		// init game board
		for (int i=0; i < result.length; i++) {
		
			result[i] = '_';
		}
		
		// start game, let the user guess
		while (attemps <= 15 && win == false) {
		
			output = String.valueOf(result);
			
			System.out.print(attemps + ". Versuch: " +output);
			
			c = s.nextLine().charAt(0); input = String.valueOf(c);
			
			// check, if letter exists in given word
				for (int n=0; n < locatedLetters.length; n++) {
				
					located = check(locatedLetters, input);
					
					if ( locatedLetters[n] == 0 && located == false) {
					
						locatedLetters[n] = c;
						break;
					}
				}
			
			// count successful attemps and some other housekeeping stuff
				for (int i=0; i < charsInWord.length; i++) {
				
					String temp = String.valueOf(charsInWord[i]);
					
					if (input.equalsIgnoreCase(temp) && located == false) {
					
						result[i] = charsInWord[i];
						success++;
					}
				}
			
			// Print victory on the screen
				if (success >= result.length) {
				
					output = String.valueOf(result);
					System.out.println("Du hast gewonnen!");
					win = true;
				}
				
		
		 attemps++;
		} // END WHILE
		
		if (attemps >= 15 && win == false) {
		
			output = String.valueOf(charsInWord);
			
			System.out.println("Leider verloren!");
		}
		
		s.close();
		
	}
}
