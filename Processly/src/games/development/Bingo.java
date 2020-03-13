package games.development;

import javax.tools.utilities.*;

public class Bingo {

	public static void main(String[] args) {
	
		int[][] bingoField = new int[5][5];
		
		
		List list = new List();
		
		for (int i = 0; i < bingoField.length; i++) {
			
			for (int j = 0; j < bingoField[i].length; j++) {
				
				bingoField[i][j] = (int) (Math.random() * 100 + 1);
				
				list.add(bingoField[i][j]);
				
				System.out.print(bingoField[i][j] + " ");
			}
			System.out.println();
		}
		
		list.delete(InputReader.readInt());
		
		System.out.println("Als Liste: ");
		
		list.printList();

	}
}
