
public abstract class Train extends Thread
{
   private Segment segment;
   private Station station;
   private Track track;
   private int trainID;

   public abstract int getSpeed();

   public int getTrainID()
   {
      return trainID;
   }

   public void run()
   {
      while (true)
      {
         // adds a train to a segment

         segment.addTrain(this);
         System.out.println("train in segment");

         if (segment instanceof Station)
         {
            try
            {
               Thread.sleep(station.stopTime(this.getSpeed()));
               System.out.println(station.stopTime(this.getSpeed()));
            }
            catch (InterruptedException e)
            {
               e.printStackTrace();
            }

         }
         else if (segment instanceof Track)
         {
            try
            {
               Thread.sleep(track.travelTime(this.getSpeed()));
               System.out.println(track.travelTime(this.getSpeed()));
            }
            catch (InterruptedException e)
            {
               e.printStackTrace();
            }
         }
         // removes a train from the segment
         segment.removeTrain(this);
         
      }
   }
}
