import java.util.Scanner;

public class scanner01{
	public static void main(String [] args){
		Scanner getIn = new Scanner(System.in);
		System.out.print("Enter a phrase >");
		String phrase = getIn.nextLine();

		System.out.print("Enter a starting position >");
		int startPos = getIn.nextInt();

		System.out.print("Enter an ending position >");
		int endPos = getIn.nextInt();

		String phrasePart = phrase.substring(startPos, endPos);
		System.out.println("The part is "+ phrasePart);
		getIn.close();
	}
}
