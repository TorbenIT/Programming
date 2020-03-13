package test.tutorials;

public class ComplexArrays {

	// arr = {7, 4, 3, 5}
	
	public static int[] crazy(int[] arr) {
	
		for (int i = 1; i < arr.length; i++) {
		
			System.out.println("Array an Stelle " + i + ": " +arr[i]);
			
			int tmp = arr[i]; // temp = 4
			
			System.out.println("Wert von tmp: " + tmp);
			
			int j = i - 1; // j = 0
			
			while (j >= 0 && arr[j] > tmp) {
			
				System.out.println("Wert von j: " + j);
				arr[j+1] = arr[j]; // arr[1] = 4
				System.out.println("WHILE: Wert an Stelle arr[a+j]: " + arr[j+1]);
				j--;
				
				System.out.println("Wert von j am Ende des Schleifendurchlaufs: " + j);
			}
			arr[j+1] = tmp; // arr[1] = 4
			System.out.println("FOR LOOP: Wert an Stelle arr[a+j]: " + arr[j+1]);
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Wert des Arrays, der zurückgegeben wird: " + arr[i]);
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
	
		int[] array = {7, 4, 3, 5};
		crazy(array);
	}
}
