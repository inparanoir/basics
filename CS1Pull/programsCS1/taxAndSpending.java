package Prog1;
// Program 1.  Tax and Spending.
// Nathan
import java.util.Scanner;
import java.text.DecimalFormat;

public class Program1 {
    public static void main (String [] args) {
        Scanner getDouble = new Scanner(System.in);
        System.out.print("Please enter your annual income: ");
        // This sets the annual income, aI into a double
        double aI = getDouble.nextDouble();

        // Setting the format for the outputs.
        DecimalFormat f1 = new DecimalFormat("$##,##0.00");
        // DecimalFormat f2 = new DecimalFormat("#0%");

        // Setting the constants.
        // The amount of tax the city takes: 3%
        double tax = .03;
        // Amount taxed from annual income: aI*tax
        double greaterGood = tax*aI;

        // What percentages of the tax goes into what service.
        // Infrastructure percentage: 37%
        double Infr = .37;
        // Prison Security/Reinforcement: 26%
        double Sec = .26;
        // Kryptonite Removal and Disposal: 17%
        double Kry = .17;
        // Super-Villain Rehabilitation Program: 12%
        double Rehab = .12;
        // Superman Museum: 5%
        double Muse = .05;
        // Daily Planet Newspaper Subsidy: 3%
        double Dai = .03;

        // This will now take the tax and divide it into each percentage of use.
        // Creating the amounts after dividing the tax.
        double pI = greaterGood*Infr; // Percent going to Infra.
        double pS = greaterGood*Sec; // Percent going to Sec.
        double pK = greaterGood*Kry; // Percent going to Kry.
        double pR = greaterGood*Rehab; // Percent going to Rehab.
        double pM = greaterGood*Muse; // Percent going to Muse.
        double pD = greaterGood*Dai; // Percent going to Sub.

        System.out.println("\tThe amount taxed will be: \t"+f1.format(greaterGood));
        System.out.println();
        System.out.println("\tInfrastructure: \t\t"+f1.format(pI));
        System.out.println("\tPrison Reinforcement: \t\t"+f1.format(pS));
        System.out.println("\tKryptonite REmoval: \t\t"+f1.format(pK));
        System.out.println("\tVillain Rehabilitation: \t"+f1.format(pR));
        System.out.println("\tSuperman Museum: \t\t"+f1.format(pM));
        System.out.println("\tDaily Planet Subsidy: \t\t"+f1.format(pD));
        getDouble.close();
    }
}
