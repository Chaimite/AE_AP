import java.util.ArrayList;

public class Segment extends Thread
{
   ArrayList<Object> segment = new ArrayList<Object>();
   private Train train;
   protected int capacity;

   public void removeTrain(Train t)
   {
      segment.remove(t);
   }

   public void addTrain(Train t)
   {
      segment.add(t);
   }

   public boolean isCapacityFull()
   {
      if (segment.size() == capacity)
      {
         return false;
      }
      else
      {
         return true;
      }

   }

   public int printTrainID()
   {
      return train.getTrainID();
   }

   public void run()
   {
      this.addTrain(train);
   }

}
