
public class Track
{
   final private int length = 1000;
   private int capacity;
   private Train train;
   private Station s;

   public Track(Station s)
   {
      this.s = s;
   }
   
   public int travelTime(int speed)
   {
      int travelTime = length / speed;
      return travelTime;
   }

   // Not sure if using an int is the best option
   public boolean isCapacityFull(int capacity)
   {
      if (capacity == 1)
      {
         return true;
      }
      else
      {
         return false;
      }

   }
   
   public synchronized Train removeTrainFromTrack()
   {
      Train temp = train;
      train = null;
      return temp;
   }
   
   public String toString()
   {
      return "|----track----|";
   }

   public boolean hasATrain()
   {
      if(train == null)
      {
         return true;
      }
      return false;
   }

   public void addTrainToTrack(Train train)
   {
      
      
   }

  

}
