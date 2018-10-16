package Lab5Package;

//A fourth program in Java. Learning Scanner.
//Nathan

import java.util.Scanner;

public class Lab5
{
	public static void main (String [] args)
	{
		Scanner getDouble = new Scanner(System.in);
		System.out.print("Please enter the length for side A: ");
		double sA = getDouble.nextDouble();

		System.out.print("Please enter the length for side B: ");
		double sB = getDouble.nextDouble();

		// using sqrt double sC = Math.sqrt((sA*sA)+(sB*sB));

		double sC = Math.pow(sA,2) + Math.pow(sB, 2);

		final double fC = Math.sqrt(sC);

		System.out.println("The hypotenuse is "+ fC);
		getDouble.close();
	}
}
