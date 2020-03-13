package prog1.klausur;

public class Vielfache_Integer {

	public static int monitor(int[] arr) {
	
		int counter = 0;
		
		for (int i=0; i < arr.length; i++) {
		
			if (arr[i] % 3 == 0) {
				
				System.out.println(arr[i] + " ist ein Vielfaches von 3.");
				counter++;
			}
		}
		return counter;
	}
	
	
	
	public static void main(String[] args) {
	
		int[] numbers = {-3, 6, 9, 5, 0};
		
		System.out.println("Anzahl der Vielfache von 3 im Array: " + monitor(numbers));
	}
}
