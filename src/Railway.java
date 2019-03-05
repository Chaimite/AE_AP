import java.util.ArrayList;

public class Railway extends Thread
{
   ArrayList<Object> trainsInSpecificPart = new ArrayList<Object>();
   private Train train;
   protected int capacity;

   public void removeTrain(Train t)
   {
      trainsInSpecificPart.remove(t);
   }

   public void addTrain(Train t)
   {
      trainsInSpecificPart.add(t);
   }

   public boolean isCapacityFull()
   {
      if (trainsInSpecificPart.size() == capacity)
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
