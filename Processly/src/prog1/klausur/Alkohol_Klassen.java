package prog1.klausur;

public class Alkohol_Klassen {

	final static double P = 0.8;
	
	final static double m = 0.7, w=0.6, j=0.5;
	
	public static double berechneMasse(int volumen, double aVAnteil) {
	
		double alkMasse = volumen * aVAnteil * P;
		
		return alkMasse;
	}
	
	public static double berechneAlkKonzentration(double AlkMasse, double gewicht, char typ) {
	
		double result = 0.0;
		
//		if (typ == ' ' || typ != 'm' || typ != 'w' || typ != 'j') {
//		
//			System.out.println("Fehlerhafte Geschlechtseingabe!");
//			
//			return -1.0;
//		
//		} else {
		
			switch (typ) {
			case 'm':
				result = AlkMasse / gewicht * m;
				break;
			case 'w':
				result = AlkMasse / gewicht * w;
				break;
			case 'j':
				result = AlkMasse / gewicht * j;
				break;
			default:
				System.out.println("Fehlerhafte Geschlechtseingabe!");
				return -1.0;
			}
		
		return result;
	}
	
	
	public static void main(String[] args) {
	
		double alkMasse = berechneMasse(330, 0.048);
		
		System.out.println(alkMasse);
		
		double k = berechneAlkKonzentration(alkMasse, 83.6, 'm');
		
		if (k > 0.5) System.out.println("Sie dürfen kein Auto mehr fahren!!!");
		
		if (0.3 < k && k < 0.5) System.out.println("Sie sollten kein Auto mehr fahren!!!");
		
		System.out.println("Deine Alkohol-Konzentration: " + k);
	}
}
