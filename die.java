import java.util.Random;

public class die
{
  private int die1, die2, roll = 0;
  Random r = new Random ();
  public die ()
  {
    die1 = r.nextInt(6) + 1;
    die2 = r.nextInt(6) + 1;
  }
  public int roll ()
  {
    roll = die1 + die2;
    System.out.println("You rolled: " + roll);
    return(roll);
  }
}
    
    
  