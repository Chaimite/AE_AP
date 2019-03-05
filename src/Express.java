
public class Express extends Train
{
   final private int speed = 500;
   private Track track;
   private Station station;
   private int trainID;

   public Express(int trainID)
   {
      this.trainID = trainID;
   }

   @Override
   public int getSpeed()
   {
      return speed;
   }
}
