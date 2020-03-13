package application;

public class TV_Ticker {

	private char[] message;
	private int size;
	
	
  // Constructor
	public TV_Ticker(int s) {
	
		if (s > 0 ) { 
			
			this.size = s;
		
		} else {
			
			this.size = 200;
		
		}
		
		message = new char[this.size];
		
		for (int i = 0; i < message.length; i++) {
			
			message[i] = ' ';
		}
	
	
	}


  // Programstart
	public static void main(String[] args) {
	
		String news = "Breaking News: New outbreak clusters spark alarm";
		TV_Ticker display = new TV_Ticker(70);
		display.setMessage(news.toCharArray());
		
		System.out.println(display.getMessage());
		
		display.rotateMessage(6);
		
		System.out.println(display.getMessage());
		
		
	}
	




  // GETTER---- SETTER
	public void setMessage(char[] message) {
		
		
		if (message.length < this.message.length) {
			
			for (int i = 0; i < message.length; i++) {
				
				this.message[i] = message[i];
			}
			
			for (int j = message.length; j < this.message.length; j++) {
				
					this.message[j] = '+';
			}
			
		
		} else {
			
			for (int i = 0; i < this.message.length; i++) {
				
				this.message[i] = message[i];

			}
		} 
	}

	public char[] getMessage() { return this.message; }
	
	public int getSize() { return size; }

	
	
  // Methods
	public void resetMessage(char token) {
		
		for (int i = 0; i < this.message.length; i++) {
			
			this.message[i] = token;
		}
	}
	
	public void resetMessage() {
		
		for (int i = 0; i < this.message.length; i++) {
			
			this.message[i] = '+';
		}
	}

	public void rotateMessage(int distance) {
	
		char[] copy = message.clone();
		
		if (distance > 0 && distance < size) {
		
			for (int i = 0; i < message.length; i++) {
				
				if ( i < message.length - distance) {
				
					message[i] = copy[i + distance];
				
				} else {
				
					message[i] = copy[-(message.length - distance) + i];
				}
			}
		}
	}
	
}
