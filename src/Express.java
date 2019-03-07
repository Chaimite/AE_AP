
public class Express extends Train
{
   final private int speed = 500;

   public Express(int trainID, Segment segment)
   {
      super(segment, trainID);
   }

   @Override
   public int getSpeed()
   {
      return speed;
   }
}
