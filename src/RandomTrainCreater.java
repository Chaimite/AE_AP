import java.util.Random;

public class RandomTrainCreater extends Thread
{
   private Train newTrain;
   private int delay;
   private int trainID = 0;
   private Segment routeStart;
   private Random rand = new Random();

   @Override
   public void run()
   {
      routeStart = generateRoute();
      Printer printer = new Printer(routeStart);
      Thread printerThread = new Thread(printer);
      printerThread.start();

      while (true)
      {
         try
         { // sleeps the train for a random time
            Thread.sleep(trainDelayCreator());
         }
         catch (InterruptedException e)
         {
            e.printStackTrace();
         }
         // inserts a random train in a the beginning of a track
         Train train = trainCreator();
         Thread trainThread = new Thread(train);
         trainThread.start();

      }
   }

   // method to create a random int between an interval
   public int getRandomNumber(int min, int max)
   {
      int randomNumber = rand.nextInt((max + 1) - min) + min;
      return randomNumber;
   }

   // creates a random train with an id
   public Train trainCreator()
   {
      trainID++;
      int randomNumber = getRandomNumber(0, 1);
      if (randomNumber == 0)
      {
         newTrain = new Express(trainID, routeStart);
      }
      else
      {
         newTrain = new Local(trainID, routeStart);
      }

      return newTrain;

   }

   // creates a random delay between 0 and 1000
   public int trainDelayCreator()
   {
      delay = getRandomNumber(2000, 5000);
      return delay;
   }

   // generates a route
   public Segment generateRoute()
   {
      Segment s4 = new Station("Inverness", 4, null);
      Segment t3 = new Track(s4);
      Segment s3 = new Station("Perth", 4, t3);
      Segment t2 = new Track(s3);
      Segment s2 = new Station("Stirling", 4, t2);
      Segment t1 = new Track(s2);
      Segment s1 = new Station("Horsens", 4, t1);
      return s1;
   }

}
