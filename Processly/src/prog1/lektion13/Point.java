package prog1.lektion13;

public class Point {

	// A point in a three-dimensional
	// 			   coordinates system
	
	/*
	 * 	STRG + SHIFT + o
	 * 
	 * 	variadic function=: 
	 *  public void doSomething(String... string) {
	 *  
	 *  }
	 * 
	 * */
	
	
	int length; // x
	int height; // y
	int width; // z
	
	public Point(int... threeDim) {
	
		this.length = threeDim[0];
		
		this.height = threeDim[1];
		
		this.width = threeDim[2];
	}

	
	// optional: getter, setters
	
	
	public double calcOrigin() {
	
		double d = 0;
		
		d = Math.sqrt(Math.pow(this.length, 2) + 
				Math.pow(this.height, 2) + Math.pow(this.width, 2));
	
	
		return d;
	}

	public String toString() {
	
		return  "Beispiel fuer Punkt P( " +this.length+","+this.height+","+this.width+"):\n"
				 + "\tx=" + this.length + ", y=" + this.height + ", z=" + this.width;
	}
	
	public static void main(String[] args) {
	
		Point p = new Point(2, 5, 7);
		
		System.out.println(p);
	}
}
