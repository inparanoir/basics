package TempCon;

//A third program in Java. Converting inches to centimeters.
//Nathan

public class TempCon
{
	public static void main (String [] args)
	{

		// Freezing point of water is 32
		double Frz = 32;

		// Fahr is the Temperature in Fahrenheit
		int Fahr = 86;

		// Conversion from F to C
		final double Celc = 5.0/9.0*(Fahr - Frz);

		// Celc back in to Fahr
		final double TF = 9.0/5.0*Celc + Frz;
		// Conversion from C to F
		// final double TF = Celc*5.0/9.0 + 32;

		System.out.println (Celc + " in Celcius, is the same as "+Fahr+" degrees Fahrenheit.");
		System.out.println ("Proving " +Celc+ " back into Fahrenheit: " + TF);

		System.exit(0);
	}
}
