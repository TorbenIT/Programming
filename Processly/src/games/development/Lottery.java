package games.development;

import javax.tools.utilities.List;

public class Lottery {

	public static void main(String[] args) {
	
		int[] drawnNumbers = new int[6];
		
		int number;
		
		List lottoGame = new List();
		
		// all numbers from 1 to 49 into the list
		for (int i = 1; i <= 49; i++) {
			
			lottoGame.add(i);
		}
		
		// generate 6 lotto numbers
		
		System.out.print("Die Lottozahlen: ");
		
		for ( int i=0; i < 6; i++) {
		
			number = (int) ((Math.random()*49)+1);
			
			if ( check(drawnNumbers, number)) {
			
				number = (int) ((Math.random()*49)+1);
				
				check(drawnNumbers, number);
			}
			
			
			drawnNumbers[i] = number;
			
			lottoGame.delete(number);
			
			System.out.print(" " + drawnNumbers[i]);
		}
		
		
		
		System.out.println();
		System.out.println("[Test] Liste nach der Ziehung: ");
		lottoGame.printList();
	}

	private static boolean check(int[] drawnNumbers, int number) {

		for (int i = 0; i < drawnNumbers.length; i++) {
			
			if (number == drawnNumbers[i]) {
				
				return true;
			}
		}
		
	 return false;	
	}
}
