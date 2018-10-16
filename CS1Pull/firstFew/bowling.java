package bowling;

//A first program in Java
//H, Nathan

public class bowling
{
	public static void main (String [] args)
	{
		int H1 = 176;						    //first game
		int H2 = 163;						    //second game
		int H3 = 171;						    //third game
		int SUM = H1 + H2 + H3; 		//sum of all games.
		int AVG = SUM /3;					  //average of all games.
		System.out.println ("The avg score that Homer bowled was: "+ AVG);	//this will show the average

		System.exit(0);
	}
}
