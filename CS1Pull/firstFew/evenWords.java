package Lab7Package;

import javax.swing.JOptionPane;
//A wordEvens program in Java
//Nathan
public class EvenWords {
	public static void main (String [] args) {
		String word = JOptionPane.showInputDialog(null, "Enter one word: ");
		// beginning of counter
		int count = 0;
		// for loop to track counter
		for (int i = 0; i< word.length();i++) {
			count++;
		}
		// this converts the input to an int to parse and count
		// int amount = Integer.parseInt(word);
		int result = count % 2;
		// this notifies user of odd characters in word
		if(result == 0)
			JOptionPane.showMessageDialog(null, "Even!");
		// this notifies user of even characters in word
		else
			JOptionPane.showMessageDialog(null, "Odd!");
		System.exit(0);
	}
}
