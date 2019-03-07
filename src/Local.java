
public class Local extends Train
{
   final private int speed = 10;

   public Local(int trainID, Segment segment)
   {
      super(segment, trainID);
   }

   @Override
   public int getSpeed()
   {
      return speed;
   }

}
