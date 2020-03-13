package javax.tools.utilities;

import java.util.Scanner;

public class InputReader {

	static Scanner s  = new Scanner(System.in);
	
	
	public InputReader() {
	
		
	}
	
	
	public static int readInt() {
	
		String intString = s.nextLine();
				
		int number = Integer.valueOf(intString);
		
		return number;
	}
	
	public static String readString() {
		
		String string = s.nextLine();
		
		return string;
	}
	
	public static char readFirstChar() {
		
		char c = s.nextLine().charAt(0);
		
		return c;
	}

	public static void closeScanner() { 
		s.close(); 
	
		System.out.println("Program exited. Scanner was closed.");
	} 
	

}
