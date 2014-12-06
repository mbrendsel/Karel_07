/**
 * StepClimbers climb steeply rising mountains, one step across for every step of rise
 * 
* @author <...>
* @version <...>
 * 
 */
import edu.fcps.karel2.Display;

public class StepClimber extends Climber 
{
   public StepClimber()
  {
   super(8, 1, Display.NORTH, 1);
  }
   public StepClimber(int x, int y, int dir, int beep)
  {
   super(x, y, dir, beep);
  }
   
   public void climbUpLeft()
  {
   turnRight();
   move();
   turnLeft();
   move();
  }
  
   public void climbDownLeft()
  {
   move();
   turnLeft();
   move();
   turnRight();
  }
  
   public void climbUpRight()
  {
   turnLeft();
   move();
   turnRight();
   move();
  }
  
   public void climbDownRight()
  {
   move();
   turnRight();
   move();
   turnLeft();
  }
  
}
