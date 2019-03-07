
public class Track extends Segment
{
   final private int length = 1000;
   private Train train;

   public Track(Segment segment)
   {
      super(segment);
   }

   @Override
   public synchronized void addTrain(Train train)
   {
      while (this.train != null)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
            e.printStackTrace();
         }
      }
      this.train = train;
      notifyAll();
   }

   @Override
   public synchronized void removeTrain(Train train)
   {
      if (this.train == train)
      {
         this.train = null;
      }
      notifyAll();
   }

   public int timeInSegment(int speed)
   {
      int travelTime = length / speed;
      return travelTime;
   }

   public String toString()
   {
      if (train != null)
      {
         return "|----track-" + train.getTrainID() + "---|";
      }
      return "|----track----|";
   }
}
