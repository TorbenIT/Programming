package prog1.loesungen;

public class Polynom
{
	public double[] koeff;

	/**
	 * @return Polynom als String dargestellt
	 * @since V15.00
	 */
	public String toString()
	{
		String finalString = "";

		for (int i = koeff.length - 1; i >= 0; i--)
		{
			finalString = finalString + (koeff[i] > 0 ? "+" : (koeff[i] < 0 ? "-" : "")) + " " + Math.abs(koeff[i])
					+ "x^" + i;
			if (i != 0)
				finalString = finalString + " ";
		}
		return finalString;
	}

	/**
	 * @param a
	 *            1. Faktorpolynom
	 * @param b
	 *            2. Faktorpolynom
	 * @return Produkt der beiden Polynome
	 * @since V15.00
	 */
	public static Polynom multiply(Polynom a, Polynom b)
	{
		int newLength = a.koeff.length + b.koeff.length;
		double[] newKoeffs = new double[newLength - 1];

		for (int aK = 0; aK < a.koeff.length; aK++)
		{
			for (int bK = 0; bK < b.koeff.length; bK++)
			{
				newKoeffs[aK + bK] += a.koeff[aK] * b.koeff[bK];
			}
		}

		return new Polynom(newKoeffs);
	}

	/**
	 * Dividiert das Polynom durch eine Zahl a
	 * 
	 * @param a
	 *            Zahl, durch die dividiert werden soll
	 * @return Ob die Division funktioniert hat (false fuer a = 0)
	 * @since V15.00
	 */
	public boolean divideByNumber(double a)
	{
		if (a == 0)
			return false;

		return multiplyByNumber(1 / a);
	}

	/**
	 * Multipliziert das Polynom mit einer Zahl a
	 * 
	 * @param a
	 *            Zahl, mit der das Polynom multipliziert werden soll
	 * @return Ob die Multiplikation geklappt hat
	 * @since V15.00
	 */
	public boolean multiplyByNumber(double a)
	{
		for (int i = 0; i < koeff.length; i++)
			koeff[i] *= a;

		return true;
	}

	/**
	 * Multipliziert das Polynom mit einem anderen Polynom Benutzt intern die
	 * statische Methode Polynom.mutliply
	 * 
	 * @param a
	 *            Polynom, mit dem multipliziert werden soll
	 * @return Hat Multiplikation funktioniert?
	 * @since V15.00
	 */
	public boolean multiplyByPolynom(Polynom a)
	{
		koeff = Polynom.multiply(this, a).koeff;
		return true;
	}
	
	/**
	 * Addiert ein Polynom
	 * 
	 * @param a
	 *            Polynom, das addiert werden soll
	 * @return Hat Addition geklappt?
	 * @since V15.00
	 */
	public boolean addPolynom(Polynom a)
	{
		int newLength = Math.max(koeff.length, a.koeff.length);
		double[] newKoeff = new double[newLength];

		for (int g = 0; g < newKoeff.length; g++)
		{
			newKoeff[g] = 0;
			if (g < a.koeff.length)
				newKoeff[g] += a.koeff[g];
			if (g < koeff.length)
				newKoeff[g] += koeff[g];
		}
		koeff = newKoeff;
		return true;
	}

	/**
	 * Gibt den Polynomgrad an
	 * 
	 * @return Polynomgrad
	 */
	public int getPolynomGrad()
	{
		return koeff.length;
	}

	public Polynom(double[] koeffs)
	{
		koeff = koeffs;
	}

	/**
	 * Setzt fuer das Polynom einen Wert sein
	 * 
	 * @param x
	 *            Einzusetzender Wert
	 * @return Ergebnis fuer P(x)
	 * @since V15.00
	 */
	public double setX(double x)
	{
		double result = 0;
		for (int k = 0; k < koeff.length; k++)
			result += Math.pow(x, k) * koeff[k];
		return result;
	}

	/**
	 * - Polynominterpolation - Gibt das Lagrange-Polynom basierend auf einem
	 * Datenarray und dem aktuellen Index zurueck.
	 * 
	 * @param data
	 *            Datenarray
	 * @param position
	 *            Aktueller Index
	 * @return Lagrange Polynom
	 * @since V15.00
	 */
	protected static Polynom getLagrangePolynom(double[][] data, int position)
	{
		Polynom polynom = new Polynom(new double[] { 1d });
		double toDivide = 1;

		for (int index = 0; index < data.length; index++)
		{
			if (index == position)
				continue;

			double[] dataset = data[index];

			Polynom toMultiply = new Polynom(new double[] { -dataset[0], 1d });

			toDivide *= data[position][0] - dataset[0];
			polynom.multiplyByPolynom(toMultiply);
		}
		polynom.divideByNumber(toDivide);
		return polynom;
	}

	/**
	 * Interpoliert die Daten unter Anwendung des Lagrange Algorithmus
	 * 
	 * @param data
	 *            Daten-Array. 2. Dimension muss Laenge 2 haben!
	 * @return Interpoliertes Polynom
	 * @throws Exception
	 * @since V15.00
	 */
	public static Polynom interpolateLagrange(double[][] data) throws Exception
	{
		Polynom finalPolynom = new Polynom(new double[] { 0d });
		for (int index = 0; index < data.length; index++)
		{
			double[] dataset = data[index];

			if (dataset.length != 2)
				throw new Exception(
						"Error - Polynom.interpolateLagrange - data-Array muss in zweiter Dimension immer Laenge 2 haben!");

			Polynom lagrange = getLagrangePolynom(data, index);
			lagrange.multiplyByNumber(dataset[1]);
			finalPolynom.addPolynom(lagrange);
		}
		return finalPolynom;
	}

	public static void main(String[] args)
	{
		// Testet die Lagrange Interpolation mit zufaelligen Werten
		double[][] data = new double[][] { { 0, Math.floor(Math.random() * 10 - 5) },
				{ 1, Math.floor(Math.random() * 10 - 5) }, { 2, Math.floor(Math.random() * 10 - 5) } };

		try
		{
			// Eigentlich unnoetiges try-catch, aber Eclipse meckert sonst.

			Polynom polynom = Polynom.interpolateLagrange(data);
			System.out.println("Daten:");
			for (int i = 0; i < data.length; i++)
				System.out.println(data[i][0] + " | " + data[i][1]);
			System.out.println("Interpoliertes Polynom: f(x) = " + polynom.toString());
			for (int i = 0; i < data.length; i++)
				System.out.println(
						"Test mit x = " + data[i][0] + ": f(" + data[i][0] + ") = " + polynom.setX(data[i][0]));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}