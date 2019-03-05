

public abstract class Train extends Thread
{
   private Railway railway;
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
         // adds a train to a railway

         railway.addTrain(this);

         if (railway instanceof Station)
         {
            try
            {
               Thread.sleep(station.stopTime(this.getSpeed()));
            }
            catch (InterruptedException e)
            {
               e.printStackTrace();
            }

         }
         else if (railway instanceof Track)
         {
            try
            {
               Thread.sleep(track.travelTime(this.getSpeed()));
            }
            catch (InterruptedException e)
            {
               e.printStackTrace();
            }
         }
         // removes a train from the railway
         railway.removeTrain(this);
      }
   }
}
