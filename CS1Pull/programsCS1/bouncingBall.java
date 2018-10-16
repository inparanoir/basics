// Nathan. Bouncing Ball. 04/13/18

package prog03.BouncingBall;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class bouncingBall {
    public static void main(String[] args) throws IOException {
        File bounceDataFile = new File("bouncedata.txt");
        Scanner ball = new Scanner(bounceDataFile);
        DecimalFormat f1 = new DecimalFormat("#,###.##");
        while (ball.hasNextDouble( )) {
                double initialDropHeight = ball.nextDouble( );                     		//reads drop height from file
                double firstBounceHeight = ball.nextDouble() ;                     		//reads bounce height from file
                double numberBounces = ball.nextDouble( );                        		//reads number of bounces from file
                double actualBounces = 0;                                        		//setting actual bounces starting at 0
                double bounceIndex = (firstBounceHeight / initialDropHeight);     		//calculates the bounciness index
                double distance = 0;
                System.out.println("Initial drop height:\t\t" + f1.format(initialDropHeight) + "\tft.");
                System.out.println("First bounce height:\t\t" + f1.format(firstBounceHeight) + "\tft.");
                System.out.println("Bounciness Index results:\t" + f1.format(bounceIndex));
                System.out.println("Number of bounces:\t\t" + f1.format(numberBounces));
                while (numberBounces > 0 && firstBounceHeight > 0.001)					//creates loop to calculate distance for each bounce
                {
                    distance = distance + initialDropHeight + firstBounceHeight;     	//distance of first bounce
                    initialDropHeight = firstBounceHeight;                           	//drop height same as bounce height
                    firstBounceHeight = initialDropHeight*bounceIndex;               	//heighth of the next bounce
                    numberBounces--;                                                 	//counts bounces for 0
                    actualBounces++;                                                 	//how many times the ball bounces
                }
            System.out.println("Actual number of bounces:\t" + f1.format(actualBounces));
            System.out.println("Distance:\t\t\t" + f1.format(distance) + "\tft.");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        }//end of loop
    ball.close();// closes scanner
    }//end of method
}//end of BouncingBall class
