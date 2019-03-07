import java.util.ArrayList;

public class Station extends Segment
{
   final private int length = 100;
   final private int stop = 5;
   private String name;
   private ArrayList<Train> trains;
   private int maxCapacity;

   public Station(String name, int maxCapacity, Segment segment)
   {
      super(segment);
      this.name = name;
      this.maxCapacity = maxCapacity;
      trains = new ArrayList<Train>(maxCapacity);
   }

   @Override
   public synchronized void addTrain(Train train)
   {
      while (trains.size() > maxCapacity)
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
      trains.add(train);
      notifyAll();
   }

   @Override
   public synchronized void removeTrain(Train train)
   {
      trains.remove(train);
      notifyAll();
   }

   @Override
   public int timeInSegment(int speed)
   {
      int stopTime = length / speed + stop;
      return stopTime;
   }

   public String toString()
   {
      String s = "|----" + name + "-";
      for (Train train : trains)
      {
         s += train.getTrainID() + ",";

      }

      s += "----|";
      return s;
   }
}
