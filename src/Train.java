
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
      {  // adds a train object to a segment
         segment.addTrain(this);

         try
         {  //sleeps the thread for time that it is needed in a specific segment, 
            //3000 is for it to work better
            Thread.sleep(segment.timeInSegment(this.getSpeed()) + 3000);
            //removes it from the segment
            segment.removeTrain(this);
            //gets the next segment
            segment = segment.getNextSegment();
            //if the segment is null it stops the thread
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
