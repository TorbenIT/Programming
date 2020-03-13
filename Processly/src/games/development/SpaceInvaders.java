package games.development;

import java.util.*;

public class SpaceInvaders {

	static char[][] game = new char[5][8];

	
	
	
	public SpaceInvaders() {
	
	  int random = (int) (Math.random() * 8);	
		
		for (int row = 0; row < game.length; row++) {
			
			for ( int column = 0; column < game[row].length; column++) {
			
				if (row == 0)
					game[row][column] = 'o';
				
				else if (row == game.length - 1 && column == random)
					game[row][column] = 'V';
				
				else
					game[row][column] = ' ';
			
			}
		}
	}
	
	
	public void bewege (char c) {
	
	 int position = -1;	
		
		if (c == 'a') {
		
			// Prüfe, ob an erster Stelle der Zeile, wenn nein geh die einzelnen Spalten der Zeile durch
				if (game[game.length - 1][0] != 'V') {
					
					for (int i = 0; i < game[game.length-1].length; i++) {
						
						if (game[game.length-1][i] == 'V') {
							
							//nach links bewegen
							  position = i;
							  
							  game[game.length-1][i] = ' ';
							  
							  position = position - 1;
							  
							  game[game.length-1][position] = 'V';
							  
							  break;
						}
					}
				}
		 }
		 
		else if (c == 'd') {
			
			// Prüfe, ob an letzter Stelle der letzten Zeile ist: game[4][7]
				if (game[game.length-1][game[game.length-1].length] != 'V') {
					
					for (int i=0; i < game[game.length-1].length; i++) {
						
					 	if (game[game.length-1][i] == 'V') {
							
					 		position = i;
							
							game[game.length-1][i] = ' ';
							
							position = position + 1;
							
							game[game.length-1][position] = 'V';
							
							break;
					 	}
					}
				}
		}
	}
	
	
	private void init() {
	
		  int random = (int) (Math.random() * 8);	
			
			for (int row = 0; row < game.length; row++) {
				
				for ( int column = 0; column < game[row].length; column++) {
				
					if (row == 0)
						game[row][column] = 'o';
					
					else if (row == game.length - 1 && column == random)
						game[row][column] = 'V';
					
					else
						game[row][column] = ' ';
				
				}
			}
	}
	
	
	
	public String toString() {
		
		String result = " ";
		
		for (int row=0; row < game.length; row++) {
		
			for (int column=0; column < game[row].length; column++) {
			
				result = result + game[row][column];
			}
			result = result + "\n";
		} 
		
		return "Spielfeld: \n" +
			result;
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		SpaceInvaders game = new SpaceInvaders();
		Scanner s = new Scanner(System.in);
		
		System.out.println(game);
		
		boolean gameStarted = true;
		
		while (gameStarted) {
			
			char c = s.nextLine().charAt(0);
			
			if (c == 'x') {
				
				gameStarted = false;
				break;
			}
			
			game.bewege(c);
			
			System.out.println(game);
		}
		
		s.close();
	}


}
