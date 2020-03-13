package test.tutorials;

public class StringCommunity {

	public static String combine(String... strings) {
		
		String result = "";
		
		for (int i=0; i < strings.length; i++) {
		
			result += strings[i];
			
			if (i  != strings.length - 1) {
				
				result += ", ";
			}
		}
		
		return result;
	}

	
	
	
	public static void main(String[] args) {
	
		String a = "alex"; // 25. Buchstabe
		
		String b = "aley"; // 26. Buchstabe
		
		int res = b.compareTo(a); // char von b - char von a
		
		
		
		
		
		System.out.println(res);
	}

	
	public boolean isAlphabaticOrder(String s) {
		return false;
	
//		return this.compareTo(s) > 0;
	}
	
	
	
	
	


}
