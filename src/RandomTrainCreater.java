import java.util.Random;

public class RandomTrainCreater
{
   private Train newTrain;
   private Track newTrack;
   private Station newStation;
   private int delay;

   public RandomTrainCreater()
   {
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

   // 0 or 1 to place the train object in the first track or station
   // must also enter a delay
   //what about placing it? Where is it gonna be placed?
   public void trainPlacer()
   {
      Train trainType = trainCreater();
      int random = getRandomNumber(0, 1);
      
      if (random == 0)
      { // create an array with all station names?
        // instead of defining their name here
         new Station("Glasgow", trainType);
      }
      else
      { // same as above for trackID
         new Track(1, trainType);
      }

   }

   public int trainDelayCreater()
   {
      delay = getRandomNumber(0, 1000);
      return delay;
   }

}
