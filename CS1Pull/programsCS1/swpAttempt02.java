package prog;

import javax.swing.JOptionPane;

public class jem {
	public static void main (String [] args) {
			String SPECIAL_CHARACTER1 = "!";
			String SPECIAL_CHARACTER2 = "@";
			String SPECIAL_CHARACTER3 = "$";
			String SPECIAL_CHARACTER4 = "?";
			String SPACE = " ";
			boolean invalid = true;
			System.out.println(!invalid);

			String password = JOptionPane.showInputDialog(null, "Please enter a password" + "(password must contain uppercase, lowercase, and a special character ('!' '$' '@'): ");
			int len = password.length();
			if (len < 8)
				JOptionPane.showMessageDialog(null, "is less than 8. Password's strength is too weak. Please try again");
			else if (!password.contains(SPECIAL_CHARACTER1))
			{
				JOptionPane.showMessageDialog(null, "dosen't contain a Special Character. Password's strength is too weak. Try again");
			if (!password.contains(SPECIAL_CHARACTER2))
				JOptionPane.showMessageDialog(null, "dosen't contain a Special Character. Password's strength is too weak. Try again");
			else if (!password.contains(SPECIAL_CHARACTER3))
				JOptionPane.showMessageDialog(null, "dosen't contain a Special Character. Password's strength is too weak. Try again");
			}
			else if (password.contains(SPACE))
				JOptionPane.showMessageDialog(null, " contains space. Password's strength is too weak. Try again");
			else if (password.startsWith(SPECIAL_CHARACTER1))
				JOptionPane.showMessageDialog(null, "starts with a Special Character. Password's strength is too weak. Try again");
			else if (password.startsWith(SPECIAL_CHARACTER4))
				JOptionPane.showMessageDialog(null, "starts with a Special Character. Password's strength is too weak. Try again");
			else if ( (password.charAt(0) == password.charAt(1)) && (password.charAt(1) == password.charAt(2)) )
				JOptionPane.showMessageDialog(null, "starts with three similar values. Password's strength is too weak. Try again");
			else if ( password.charAt(len - 1) == password.charAt(len - 2) && (password.charAt(len - 2) == password.charAt(len - 3)) )
				JOptionPane.showMessageDialog(null, "ends with three similar values. Password's strength is too weak. Try again");
			else
			System.out.println("Password Accepted");
		}
}
