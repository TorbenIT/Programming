package prog1.klausur;

public class Passwort_Strings {

	String password;
	
	public Passwort_Strings(String pw) {
	
		if (valid(pw) == true ) {
			
			this.password = pw;
		
		} else {
		
			this.password = null;
		}
	}

	private static boolean valid(String pw) {
		
		char[] digits = pw.toCharArray();
		
		int upperCase = 0, lowerCase=0, number = 0;
		
		for (int i=0; i < digits.length; i++) {
		
			if (digits[i] >= 'A' && digits[i] <= 'Z')
				upperCase++;
			
			if (digits[i] >= 'a' && digits[i] <= 'z')
				lowerCase++;
			
			if (digits[i] >= '0' && digits[i] <= '9')
				number++;
		}
		
		if (digits.length >= 8 && upperCase >= 2 && lowerCase >= 2 && number >= 2)
			return true;
		
		return false;
	}
	
	public boolean changePassword(String newPassword) {
	
		if (this.password == null)
			return false;
		
		char[] digitsNew = newPassword.toCharArray();
		
		char[] digits = this.password.toCharArray();
		
		
		if (digits[0] != digitsNew[0] && digits[digits.length -1] != digitsNew[digitsNew.length -1] && valid(newPassword)) {
			
			return true;
		
		} else {
		
			return false;
		}
		
		
		
	}
	
	
	
	public String toString() {
	
		String hidden = "";
		
		if (this.password == null) {
			hidden = "Kein gueltiges Passwort!";
		
		} else {
			
			char[] digits = this.password.toCharArray();
		
			for (int i=0; i < digits.length; i++) {
				
				hidden = hidden + "*";
			}
		} 
		
		return hidden;
	}
	
	public static void main(String[] args) {
	
		Passwort_Strings myPassword = new Passwort_Strings("Prog1Und2");
		
		System.out.println(myPassword);
		
		if (myPassword.changePassword("Frog1Und3") == true) {
			
			System.out.println("Passwort erfolgreich geaendert.");
		}
		
		
	}
}
