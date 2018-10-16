package competitiveProgramming;

import java.util.Scanner;

public class Steganography
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );

		String message = scan.nextLine();

		while ( ! (message.contains("#") ) )
		{
			String binary = "";
			String result = "";

			while ( ! (message.contains("*") ) )
			{
				message += scan.nextLine();
				//System.out.println("hi");

			}// end of while message does not equal "*"

			for ( int i = 0; i < message.length(); i++ )
			{
				//System.out.println("wow");
				if ( message.charAt(i) == ' ' )
				{
					int spaceCount = 1;
					while ( message.charAt(i + spaceCount) == ' ' )
					{
						spaceCount++;
						//System.out.println(spaceCount);

					}// end of while next char in message == ' '

					if ( spaceCount % 2 == 0 )
						binary += "1";
					if ( spaceCount % 2 != 0)
						binary += "0";
					i+= spaceCount;
					//System.out.println(binary);

				}// end of if message.charAt(i) == ' ' )

			}// end of for i < message.length()

			while ( binary.length() % 5 != 0 )
			{
				binary = "0" + binary;
				System.out.println(binary);
			}// end of while binary.length() % 5 != 0

			for ( int i = 0; i < binary.length()-5; i += 5 )
			{
				String sub = binary.substring( i, i + 4 );
				System.out.println(sub);
				double value = 0;

				for ( double x = 0; x < sub.length(); x++ )
				{
					if ( sub.charAt((int) x) == '1' )
					{
						value += Math.pow( 2, 5 - x );

					}// end of if sub.charAt( (int) x ) == '1'

				}// end of for x < sub.length()

				if(value == 0)
					result+=" ";
				else if(value == 1)
					result +="A";
				else if(value == 2)
					result +="B";
				else if(value == 3)
					result +="C";
				else if(value == 4)
					result +="D";
				else if(value == 5)
					result +="E";
				else if(value == 6)
					result +="F";
				else if(value == 7)
					result +="G";
				else if(value == 8)
					result +="H";
				else if(value == 9)
					result +="I";
				else if(value == 10)
					result +="J";
				else if(value == 11)
					result +="K";
				else if(value == 12)
					result +="L";
				else if(value == 13)
					result +="M";
				else if(value == 14)
					result +="N";
				else if(value == 15)
					result +="O";
				else if(value == 16)
					result +="P";
				else if(value == 17)
					result +="Q";
				else if(value == 18)
					result +="R";
				else if(value == 19)
					result +="S";
				else if(value == 20)
					result +="T";
				else if(value == 21)
					result +="U";
				else if(value == 22)
					result +="V";
				else if(value == 23)
					result +="W";
				else if(value == 24)
					result +="X";
				else if(value == 25)
					result +="Y";
				else if(value == 26)
					result +="Z";
				else if(value == 27)
					result +="'";
				else if(value == 28)
					result +=",";
				else if(value == 29)
					result +="-";
				else if(value == 30)
					result +=".";
				else if(value == 31)
					result +="?";

			}// end of for i < binary.length()
		message = "";
		System.out.println(result);
		}// end of while message does not equal "#"

	}// end of main

}// end of Steganography
