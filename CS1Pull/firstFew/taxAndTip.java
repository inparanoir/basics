package Lab6Package;

import java.util.Scanner;
import java.text.DecimalFormat;

//A taxing program in Java
//Nathan

public class TaxAndTip
{
	public static void main (String [] args)
	{
		final double tax = .075;
		final double tip = .20;
		DecimalFormat f1 = new DecimalFormat("$#,##0.00");
		Scanner getIn = new Scanner(System.in);
		System.out.print("What was the total price of the meal: ");
		double m = getIn.nextInt();

		double mealTx = m*tax;
		double costTx = mealTx+m;
		double mealTp = costTx*tip;

		System.out.println("Total Cost of meal (Including Tax): " +f1.format(costTx));
		System.out.println("Tip: " +f1.format(mealTp));
		System.exit(0);
		getIn.close();

	}
}
