import java.util.ArrayList;
import java.util.Random;

public class RandomTrainCreater extends Thread
{
   private Train newTrain;
   private int delay;
   private int trainID = 0;
   private ArrayList<Object> route = new ArrayList<Object>();

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
            e.printStackTrace();
         }
         insertTrainInRoute(trainCreater());
        
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
      trainID++;
      int randomNumber = getRandomNumber(0, 1);
      if (randomNumber == 0)
      {
         newTrain = new Express(trainID);
      }
      else
      {
         newTrain = new Local(trainID);
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
