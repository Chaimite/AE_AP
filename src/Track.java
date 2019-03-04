
public class Track extends Railway
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
