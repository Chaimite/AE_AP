
public class Local extends Train
{
   final private int speed = 10;
   private int trainID;

   public Local(int trainID)
   {
      this.trainID = trainID;
   }

   @Override
   public int getSpeed()
   {
      return speed;
   }

}
