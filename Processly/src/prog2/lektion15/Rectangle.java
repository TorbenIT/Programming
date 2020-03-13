package prog2.lektion15;

public class Rectangle {

	private double length, width;
	
	public static int rectangleCounter = 0;
	
	public Rectangle(double l, double b) {
	
		if (l > 0 && b > 0) {
			
			this.length = l;
			
			this.width = b;
		}
		
		rectangleCounter++;
	}
	
	

	public double berechneFlaeche() { 
		double area; 
		area = length*width; 
		return area;
	
	}
}


