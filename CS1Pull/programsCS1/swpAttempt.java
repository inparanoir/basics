package prog;

import javax.swing.JOptionPane;
//A wordEvens program in Java
//Nathan
public class bool { //	Begin Class
	public static void main (String [] args)	{// Begin Main
		String swordpass=JOptionPane.showInputDialog(null, "Please create a strong password with the following parameters:\n" +
								">- The password must be at least 8 characters long.\n" +
								">- The password must contain at least one character from a set \n" +
								"     that contains the &, @, or $ characters.\n" +
								">- The password must not contain spaces\n" +
								">- The password must not begin with a numeric digit.\n" +
								">- The first three characters cannot be the same.\n" +
								">- The last three characters cannot be the same.\n");

		String SPECIAL_CHARACTER1 = "!";		// Character check for !
		String SPECIAL_CHARACTER2 = "@";		// Character check for @
		String SPECIAL_CHARACTER3 = "$";		// Character check for $
		String SPACE = " ";						// Character check for a space

		String errLength=("The length must be at least 8 characters.");					// Checking 8 character length
        String errSpecial=("The special characters: &, @, or $ must be used.");			// Error check for character &, @, and $
        String errNoSpace=("Spaces may not be used.");									// Error check for spaces
        String errBeginNo=("The beginning character must not be a number.");				// Checking if begin with a numeric digit
        String errFirstChars=("The first three characters can not be the same.");		// Checking first three characters being same
        String errLastChars=("The last three characters can not be the same");			// Checking last three characters being same
        String yayPass=("Nice job, the password is accepted");

        //	Creating true/false variables for statement comparisons
        boolean len8,SPEC1,CHARRED,DIG,SPACES;

		int len = swordpass.length();
		if (len < 8)
			len8 = true;
		else
			{
			len8 = false;
			JOptionPane.showMessageDialog(null, "Invalid"+errLength);
			}
		if ((!swordpass.contains(SPECIAL_CHARACTER1)) && (!swordpass.contains(SPECIAL_CHARACTER2)) && (!swordpass.contains(SPECIAL_CHARACTER3)) )
			SPEC1 = false;
		else
			{
			SPEC1 = true;
			JOptionPane.showMessageDialog(null, "Invalid "+errSpecial);
			}
		if (swordpass.contains(SPACE))
			SPACES = true;
		else  SPACES = false;
			JOptionPane.showMessageDialog(null, "Invalid "+errNoSpace);

		if ( (swordpass.charAt(0) == swordpass.charAt(1)) && (swordpass.charAt(1) == swordpass.charAt(2)) )		// This checks the beginning characters for likeness
			CHARRED = true;
		else CHARRED = false;
			JOptionPane.showMessageDialog(null, "Invalid"+errFirstChars);

		if ( swordpass.charAt(len - 1) == swordpass.charAt(len - 2) && (swordpass.charAt(len - 2) == swordpass.charAt(len - 3)) )		// This checks the end characters for likeness
			CHARRED = true;
		else CHARRED = false;
			JOptionPane.showMessageDialog(null, "Invalid"+errLastChars);

		if (Character.isDigit(swordpass.charAt(0)))
			DIG = true;
		else DIG = false;
			JOptionPane.showMessageDialog(null, "Invalid "+errBeginNo);

		if ((len8)&&(SPEC1)&&(CHARRED)&&(DIG)&&(SPACES))
			JOptionPane.showMessageDialog(null, yayPass);

	}	// End Main
}	// End Class
