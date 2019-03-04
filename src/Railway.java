import java.util.ArrayList;

public class Railway
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

}
