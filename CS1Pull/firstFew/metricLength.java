package MetricLength;

//A third program in Java. Converting inches to centimeters.
//Nathan

public class MetricLength
{
	public static void main (String [] args)
	{
		// 2.54 cm per inch
		final double CM_PER_INCH = 2.54;

		//	state the inches amount
		final double inches = 11;

		// declare a double variable named cent
		final double cent = inches * CM_PER_INCH;

		// state original inches and the equivalent cm.
		System.out.println ("Original amount of inches: " + inches );
		System.out.println ("Original amount of centimeters: " + cent);

		System.exit(0);
	}
}
