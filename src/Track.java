
public class Track extends Segment
{
   final private int length = 1000;

   public int travelTime(int speed)
   {
      int travelTime = length / speed;
      return travelTime;
   }

   public String toString()
   {
      return "|----track----|";
   }
}
