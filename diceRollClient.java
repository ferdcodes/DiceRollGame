import java.util.Scanner;

public class diceRollClient
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);
    int points  = 1000, roll, pointsatrisk, guess = 0;
    do
    {
      System.out.println("You have " + points + " points.");
      System.out.println("How many points do you want to risk? (-1 to quit)");
      pointsatrisk = input.nextInt();
      if(pointsatrisk > 0 && pointsatrisk <= points)
      {
        System.out.println("Make a call (0 for low, 1 for high)");
        guess = input.nextInt();
        die DRPlayer = new die ();
        roll = DRPlayer.roll();
        if(roll == 7)
        {
          points = points - pointsatrisk;
        }
        else if (roll < 7 && guess == 0)
        {
          points  = points  + (pointsatrisk * 3);
        }
        else if (roll < 7 && guess == 1)
        {
          points = points - pointsatrisk;
        }
        else if (roll > 7 && guess == 0)
        {
          points = points - pointsatrisk;
        }
        else 
        {
          points = points + (pointsatrisk *3);
        }
      }    
    }while(pointsatrisk > 0 && points > 0);
  }
}