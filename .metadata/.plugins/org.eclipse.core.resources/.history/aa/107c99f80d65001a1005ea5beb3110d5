package prog1.klausur;

public class SummenReihe_Mathe {

	public static void sigma() {
	
		double result = 0.0;
		
		for (int i=1; i <= 10; i++) {
		
			result += ((potent(-1, i+1)) / i);
			System.out.println(i + ". Glied: " +result);
		}
	}
	
	public static double potent(double basis, int exp) {
		
		double result = 1.0;
		
		for (int i=1; i <= exp; i++) {
		
			result *= basis;
		}
	
		return result;
	}


	public static void main(String[] args) {
	
		sigma();
	}
}
