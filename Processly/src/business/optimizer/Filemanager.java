package business.optimizer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filemanager {

	public static void main(String[] args) {
		
		String s = "Graphik.Init.Datei.ini";
		
		int n = ersetze(s.toCharArray());
		
		System.out.println(n);
	}
	
	
	public void readFromFile() {
	
		try {
			FileInputStream f = new FileInputStream("hello.txt");
		
//			byte[256] data = f.read(256);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public static int ersetze(char[] arr) {
	
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i == (arr.length-4)) {
				
				System.out.println(arr);
				
				return counter;
			}
			
			if (arr[i] == '.') {
				
				arr[i] = '_';
				
				counter++;
			}
		}
		
		return counter;

	}
}
