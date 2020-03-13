package javax.string.utils;

public class Reverse {

	public static String reverse( String string) {
	
		char[] arr = string.toCharArray();
		char[] temp = new char[arr.length];
				// y e s
		int i = 2;
		
		for (int j = 0; j < arr.length; j++) {
			
			temp[j] = arr[i];
			i--;
		}
		
		
		String newString = String.valueOf(temp);
					
		return newString;
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		String string = "yes";
		
		
		String r = reverse(string);
		
		if (r == "sey") {
			System.out.println("Nice");
		}
		
		
		System.out.println(r);
	}
}
