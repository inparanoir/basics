package Lab6Package;

import javax.swing.JOptionPane;

//A Circular program in Java
//Nathan

public class Circumference
{
	public static void main (String [] args)
	{
		String circ = JOptionPane.showInputDialog(null, "What is the radius? ");
		double circIn = Double.parseDouble(circ);

		double circT = Math.PI * Math.pow(circIn, 2);

		JOptionPane.showMessageDialog(null,  "The circumference is: "+ circT);
		System.exit(0);

	}
}
