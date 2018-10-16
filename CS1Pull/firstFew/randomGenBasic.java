package Lab6Package;

import java.util.Scanner;
import java.util.Random;

//A yay program in Java
//Nathan
public class Lab6 {
	public static void main (String [] args) {
		Scanner getIn = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = getIn.nextInt();

		Random pick = new Random();
		int num1 = pick.nextInt(10)+1;

		double c = a*num1;

		System.out.println("The Computer chose: " +num1);
		System.out.println(a+"*" + num1 +"=" +c);
		System.exit(0);
		getIn.close();
	}
}
