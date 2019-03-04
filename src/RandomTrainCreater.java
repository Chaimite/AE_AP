import java.util.ArrayList;
import java.util.Random;

public class RandomTrainCreater implements Runnable
{
   private Train newTrain;
   private Track newTrack;
   private Station newStation;
   private int delay;
   public ArrayList<Object> route = new ArrayList<Object>();

   @Override
   public void run()
   {
      while (true)
      {
         try
         {
            Thread.sleep(trainDelayCreater());
         }
         catch (InterruptedException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         insertTrainInRoute(trainCreater());
         System.out.println(route.get(0));
      }
   }

   public int getRandomNumber(int min, int max)
   {
      Random rand = new Random();
      int randomNumber = rand.nextInt((max + 1) - min) + min;
      return randomNumber;

   }

   public Train trainCreater()
   {
      int randomNumber = getRandomNumber(0, 1);
      if (randomNumber == 0)
      {
         newTrain = new Express();
      }
      else
      {
         newTrain = new Local();
      }
      return newTrain;

   }

   public void insertTrainInRoute(Train train)
   {
      route.add(0, train);
   }

  
   public int trainDelayCreater()
   {
      delay = getRandomNumber(0, 1000);
      return delay;
   }

}
