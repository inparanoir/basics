package prog;

import javax.swing.JOptionPane;
public class lala {
    public static void main (String [] args) {
        //grab input from user/set up rules for password
        String passWord=JOptionPane.showInputDialog(null, "Enter a password:\n"
                + "-Must be at least 8 characters long\n"
                + "-Must contain at least one character from a set that contains &,@,and $\n"
                + "-Must not contain spaces\n"
                + "-Must not begin with a numeric value\n"
                + "-The first three characters cannot be the same\n"
                + "-The last three characters cannot be the same\n");
        //bring password to lower case
        String passWord2=passWord.toLowerCase();
        //find the length of the password
        int changedPW=passWord2.length();
        //find if there are special characters
        int atSign=passWord2.indexOf('@');
        int andSign=passWord2.indexOf('&');
        int moneySign=passWord2.indexOf('$');
        //find if there are any spaces
        int space=passWord2.indexOf(" ");
        //find the first character of the password
        int firstValue=passWord2.indexOf(0);
        //find the first three characters
        int beg3=passWord2.indexOf(0,2);
        //find the last three characters
        int fin3=passWord2.indexOf(5,7);

        //initial error in output
        String charError=("character length");
        String specError=("special character needed");
        String spaceError=("spaces not allowed");
        String firstValError=("first value is a number");
        String firstLastError=("first and last characters are the same");

        //create true and false variables for the if statement
        boolean charCount,specChar,spaceCount,begValue,firstLast;
        //find if first rule is followed
        if (changedPW>=8)
            charCount=true;
        else
        {
            charCount=false;
            JOptionPane.showMessageDialog(null, "Password Rejected "+ charError);
        }
        //find if second rule is followed
        if ((atSign==0)||(andSign==0)||(moneySign==0))
            specChar=true;
        else
        {
            specChar=false;
            JOptionPane.showMessageDialog(null,"Password Rejected " + specError);
        }
        //find if third rule is followed
        if (space==0)
            spaceCount=true;
        else
        {
        	spaceCount=false;
            JOptionPane.showMessageDialog(null, "Password Rejected "+spaceError);
        }
        //find if the fourth rule is followed
        if    (firstValue!=(1-9))
            begValue=true;
        else
        {
        	begValue=false;
            JOptionPane.showMessageDialog(null, "Password Rejected "+ firstValError);
        }
        //find if the fifth and sixth rules are followed
        if(beg3!=fin3)
            firstLast=true;
        else
        {
            firstLast=false;
            JOptionPane.showMessageDialog(null, "Password Rejected "+firstLastError);
        }

        if ((charCount)&&(specChar)&&(spaceCount)&&(begValue)&&(firstLast))
            JOptionPane.showMessageDialog(null, "Password accepted!");
    }
}
