package games.development;

import java.awt.*;

import javax.swing.*;

import java.awt.*;


public class Chess extends JPanel {

	char[][] game = new char[8][];
	String result = "";
	boolean[][] dang = new boolean[8][8];
	


	public void setTower(int x, int y) {
	
		
		for (int i = 0; i < dang.length; i++) {
			
			for (int j = 0; j < dang[i].length; j++) {
				
				if (i == x || j == y) dang[i][j] = true;
			}

		}
	}

	public void println(Object x) {
	
		String s = String.valueOf(" " + x);
	}
	
	public String valueOf(Object obj) {
	
// Explanation for shortened if statement	
//		if (obj == null) {
//			return "null";
//		} else {
//			return obj.toString();
//		} 
		return (obj == null) ? "null" : obj.toString();
	}
	
	public String toString() {
	
//		return getClass().getName() + "@" + Integer.toHexString(hashCode());
		String board = "";
		
		 for (int i = 0; i < dang.length; i++) {
			
			for (int j = 0; j < dang[i].length; j++) {
				
				if (dang[i][j] == true)
					board += "x ";
				else
					board += "o ";
			}
			board += "\n";
			
		} 
		
		 return board;
	
	
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		
		frame.setSize(600,600);

		frame.getContentPane();
		
		frame.setLocationRelativeTo(null);

		frame.setBackground(Color.LIGHT_GRAY);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		Chess gui = new Chess();
		
		gui.setTower(3, 5);
		
		System.out.println(gui);
	}

	
	
	public void paint(Graphics g) {
	
		g.fillRect(100, 100, 400, 400);

		
	
	}
}

