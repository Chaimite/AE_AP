
public abstract class Train implements Runnable
{
   private Segment segment;
   private int trainID;

   public Train(Segment segment, int trainID)
   {
      this.segment = segment;
      this.trainID = trainID;
   }

   public abstract int getSpeed();

   public int getTrainID()
   {
      return trainID;
   }

   public void run()
   {
      while (true)
      {
         segment.addTrain(this);

         try
         {
            Thread.sleep(segment.timeInSegment(this.getSpeed()) + 3000);
            segment.removeTrain(this);

            segment = segment.getNextSegment();

            if (segment == null)
            {
               break;
            }
         }
         catch (InterruptedException e)
         {
            e.printStackTrace();
         }
      }
   }
}
