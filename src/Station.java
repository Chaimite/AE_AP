import java.util.ArrayList;

public class Station
{
   private int speed;
   final private int length = 100;
   private String name;
   final private int stop = 5;
   private int capacity;
   private ArrayList<Train> trains;
   private Train train;
   private Track track;

   // Stations can have multiple trains at a time i.e. 3 trains at once
   public Station(String name, int capacity)
   {
      this.name = name;
      this.capacity = capacity;
   }

   public int stopTime(int speed)
   {
      int stopTime = length / speed + stop;
      return stopTime;
   }

   public boolean isCapacityFull(int capacity)
   {
      if (capacity >= 2)
      {
         return false;
      }
      else
      {
         return true;
      }
   }

   public synchronized void addTrainToStation(Train t)
   {
      while (train != null)
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
      train = t;
      notifyAll();
   }

   public synchronized void removeTrainFromStation()
   {
      while (track.hasATrain())
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
      Train temp = train;
      train = null;
      track.addTrainToTrack(temp);
   }

   public boolean hasATrain()
   {
      if (train == null)
      {
         return true;
      }
      return false;
   }

   public String toString()
   {
      return "|----" + name + "----|";
   }

}
