package prog1.klausur;

public class Polynom3 {

	 double coeffs[];

	 public Polynom3(double... coeffs){
		 
	     this.coeffs = coeffs;
	  }
	
		public String toString()
		{
			String finalString = "";

			for (int i = coeffs.length - 1; i >= 0; i--)
			{
				if (coeffs[i] > 0)
					finalString = finalString + "+" + coeffs[i] + "x^" + i;
				if (coeffs[i] < 0)
					finalString = finalString + "-" + coeffs[i] + "x^" + i;
				if (i != 0)
					finalString = finalString + " ";
			}
			return finalString;
		}
	
	public static void main(String[] args) {
	
		Polynom3 fx = new Polynom3(1.5, 4, 1.3, -8);
		
		double[] arr = fx.coeffs;
		
		for (int i = 1; i <= arr.length; i++) {

			if (i <= 2)
				System.out.print("" + arr[i-1] + "x^" + (arr.length-i) + " + ");
			else if (i == 3)
				System.out.print("" + arr[i-1] + "x" + " ");
			else
				System.out.print("" + arr[i-1]);
	 }
	}
}
